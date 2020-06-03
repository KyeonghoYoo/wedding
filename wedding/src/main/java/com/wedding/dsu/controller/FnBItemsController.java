package com.wedding.dsu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedding.dsu.common.ResponseVO;
import com.wedding.dsu.model.fnbitems.FnBItemsFnbclassificationsJoinVO;
import com.wedding.dsu.model.fnbitems.FnBItemsService;
import com.wedding.dsu.model.fnbitems.FnBItemsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 식음료 API
 * 
 * @author 유경호
 * @version 2019.10.07 v0.2
 */
@RestController
@RequestMapping("/fnbitems")
@Api(value = "FnBItemsController", description = "식음료 API")
public class FnBItemsController {
	@Autowired
	FnBItemsService fnBItemsService;

	/**
	 * 식음료 삽입 Controller
	 * 
	 * @param fnBItemsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "식음료 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<FnBItemsVO>> insertFnBItem(@RequestBody FnBItemsVO fnBItemsVO) throws Exception {
		ResponseVO<FnBItemsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 식음료 유효성 검사

		// DSU2019_Backend 식음료 데이터 삽입
		if (fnBItemsService.insertFnBItem(fnBItemsVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<FnBItemsVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(fnBItemsVO);
		return new ResponseEntity<ResponseVO<FnBItemsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 식음료 리스트 조회 Controller
	 * 
	 * @param fnBItemsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "식음료 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<FnBItemsFnbclassificationsJoinVO>>> selectFnBItems(FnBItemsVO fnBItemsVO) throws Exception {
		ResponseVO<List<FnBItemsFnbclassificationsJoinVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 식음료 유효성 검사
		responseVO.setResponse(fnBItemsService.selectFnBItems(fnBItemsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<FnBItemsFnbclassificationsJoinVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 식음료 단일 조회 Controller
	 * 
	 * @param fnBItemsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "식음료 단일 조회", httpMethod = "GET")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<FnBItemsFnbclassificationsJoinVO>> selectFnBItem(FnBItemsVO fnBItemsVO) throws Exception {
		ResponseVO<FnBItemsFnbclassificationsJoinVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 식음료 유효성 검사
		responseVO.setResponse(fnBItemsService.selectFnBItem(fnBItemsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<FnBItemsFnbclassificationsJoinVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 식음료 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updateFnBItem(FnBItemsVO fnBItemsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 식음료 유효성 검사
		if (fnBItemsService.updateFnBItem(fnBItemsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 식음료 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteFnBItem(FnBItemsVO fnBItemsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 식음료 유효성 검사
		if (fnBItemsService.deleteFnBItem(fnBItemsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
