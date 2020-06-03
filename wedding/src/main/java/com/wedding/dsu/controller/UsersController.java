package com.wedding.dsu.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedding.dsu.common.ResponseVO;
import com.wedding.dsu.model.users.UsersService;
import com.wedding.dsu.model.users.UsersVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 사용자 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@RestController
@RequestMapping("/users")
@Api(value = "UsersController", description = "사용자 API")
public class UsersController {
	@Autowired
	UsersService usersService;

	/**
	 * 사용자 로그인 Controller
	 * 
	 * @param usersVO
	 * @return
	 * @throws Exception
	 */

	/**
	 * 사용자 삽입 Controller
	 * 
	 * @param usersVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "사용자 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<UsersVO>> insertUser(@RequestBody @Valid UsersVO usersVO, Errors errors)
			throws Exception {
		ResponseVO<UsersVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 사용자 유효성 검사
		if (errors.hasErrors()) {
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage(errors.toString());
			return new ResponseEntity<ResponseVO<UsersVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		// DSU2019_Backend 사용자 데이터 삽입
		if (usersService.insertUser(usersVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<UsersVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(usersVO);
		return new ResponseEntity<ResponseVO<UsersVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 사용자 리스트 조회 Controller
	 * 
	 * @param usersVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "사용자 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<UsersVO>>> selectUsers(UsersVO usersVO) throws Exception {
		ResponseVO<List<UsersVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 사용자 유효성 검사
		responseVO.setResponse(usersService.selectUsers(usersVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<UsersVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 사용자 단일 조회 Controller
	 * 
	 * @param UsersVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "사용자 단일 조회", httpMethod = "GET")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<UsersVO>> selectUser(UsersVO usersVO) throws Exception {
		ResponseVO<UsersVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 사용자 유효성 검사
		responseVO.setResponse(usersService.selectUser(usersVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<UsersVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 사용자 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updateUser(UsersVO usersVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 사용자 유효성 검사
		if (usersService.updateUsers(usersVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 사용자 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteUser(UsersVO usersVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 사용자 유효성 검사
		if (usersService.deleteUsers(usersVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
