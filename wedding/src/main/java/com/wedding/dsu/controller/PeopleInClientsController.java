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
import com.wedding.dsu.model.peopleinclients.PeopleInClientsService;
import com.wedding.dsu.model.peopleinclients.PeopleInClientsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 거래처직원 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@RestController
@RequestMapping("/peopleinclient")
@Api(value = "PeopleInClientsController", description = "거래처 직원 API")
public class PeopleInClientsController {
	@Autowired
	PeopleInClientsService PeopleInClientsService;

	/**
	 * 거래처직원 삽입 Controller
	 * 
	 * @param peopleInClientsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "거래처직원 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<PeopleInClientsVO>> insertPeopleInClient(@RequestBody PeopleInClientsVO peopleInClientsVO) throws Exception {
		ResponseVO<PeopleInClientsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처직원 유효성 검사

		// DSU2019_Backend 거래처직원 데이터 삽입
		if (PeopleInClientsService.insertPeopleInClient(peopleInClientsVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<PeopleInClientsVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(peopleInClientsVO);
		return new ResponseEntity<ResponseVO<PeopleInClientsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 거래처직원 리스트 조회 Controller
	 * 
	 * @param peopleInClientsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "거래처직원 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<PeopleInClientsVO>>> selectPeopleInClients(PeopleInClientsVO peopleInClientsVO) throws Exception {
		ResponseVO<List<PeopleInClientsVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처직원 유효성 검사
		responseVO.setResponse(PeopleInClientsService.selectPeopleInClients(peopleInClientsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<PeopleInClientsVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 거래처직원 단일 조회 Controller
	 * 
	 * @param peopleInClientsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "거래처직원 단일 조회", httpMethod = "GET")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<PeopleInClientsVO>> selectPeopleInClient(PeopleInClientsVO peopleInClientsVO) throws Exception {
		ResponseVO<PeopleInClientsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처직원 유효성 검사
		responseVO.setResponse(PeopleInClientsService.selectPeopleInClient(peopleInClientsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<PeopleInClientsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 거래처직원 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updatePeopleInClient(PeopleInClientsVO peopleInClientsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처직원 유효성 검사
		if (PeopleInClientsService.updatePeopleInClient(peopleInClientsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 거래처직원 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deletePeopleInClient(PeopleInClientsVO peopleInClientsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처직원 유효성 검사
		if (PeopleInClientsService.deletePeopleInClient(peopleInClientsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
