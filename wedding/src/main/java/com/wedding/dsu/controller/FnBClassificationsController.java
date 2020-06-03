package com.wedding.dsu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedding.dsu.common.ResponseVO;
import com.wedding.dsu.model.fnbclassifications.FnBClassificationsService;
import com.wedding.dsu.model.fnbclassifications.FnBClassificationsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 식음료분류 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@RestController
@RequestMapping("/fnbclassifications")
@Api(value = "FnBClassificationsController", description = "식음료 분류 API")
public class FnBClassificationsController {
	@Autowired
	FnBClassificationsService fnBClassificationsService;

	/**
	 * 식음료분류 삽입 Controller
	 * 
	 * @param fnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "식음료분류 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<FnBClassificationsVO>> insertFnBClassification(@RequestBody FnBClassificationsVO fnBClassificationsVO) throws Exception {
		ResponseVO<FnBClassificationsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 식음료분류 유효성 검사

		// DSU2019_Backend 식음료분류 데이터 삽입
		if (fnBClassificationsService.insertFnBClassification(fnBClassificationsVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<FnBClassificationsVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(fnBClassificationsVO);
		return new ResponseEntity<ResponseVO<FnBClassificationsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 식음료분류 리스트 조회 Controller
	 * 
	 * @param fnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "식음료분류 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<FnBClassificationsVO>>> selectFnBClassifications(FnBClassificationsVO fnBClassificationsVO) throws Exception {
		ResponseVO<List<FnBClassificationsVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 식음료분류 유효성 검사
		responseVO.setResponse(fnBClassificationsService.selectFnBClassifications(fnBClassificationsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<FnBClassificationsVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 식음료분류 단일 조회 Controller
	 * 
	 * @param fnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "식음료분류 단일 조회", httpMethod = "GET")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<FnBClassificationsVO>> selectFnBClassification(FnBClassificationsVO fnBClassificationsVO) throws Exception {
		ResponseVO<FnBClassificationsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 식음료분류 유효성 검사
		responseVO.setResponse(fnBClassificationsService.selectFnBClassification(fnBClassificationsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<FnBClassificationsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 식음료분류 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updateFnBClassification(@PathVariable String id, @RequestBody FnBClassificationsVO fnBClassificationsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 식음료분류 유효성 검사
		fnBClassificationsVO.setId(id);
		if (fnBClassificationsService.updateFnBClassification(fnBClassificationsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 식음료분류 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteFnBClassification(FnBClassificationsVO FnBClassificationsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 식음료분류 유효성 검사
		if (fnBClassificationsService.deleteFnBClassification(FnBClassificationsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
