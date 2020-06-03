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
import com.wedding.dsu.model.fnbitemlist.FnBItemListService;
import com.wedding.dsu.model.fnbitemlist.FnBItemListVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 식음료 내역 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@RestController
@RequestMapping("/fnbitemlist")
@Api(value = "FnBItemListController", description = "식음료 내역 API")
public class FnBItemListController {
	@Autowired
	FnBItemListService fnBItemListService;

	/**
	 * 식음료 내역 삽입 Controller
	 * 
	 * @param fnBItemListVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "식음료 내역 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<FnBItemListVO>> insertFnBItemList(@RequestBody FnBItemListVO fnBItemListVO) throws Exception {
		ResponseVO<FnBItemListVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 식음료 내역 유효성 검사

		// DSU2019_Backend 식음료 내역 데이터 삽입
		if (fnBItemListService.insertFnBItemList(fnBItemListVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<FnBItemListVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(fnBItemListVO);
		return new ResponseEntity<ResponseVO<FnBItemListVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 식음료 내역 조회 Controller
	 * 
	 * @param fnBItemListVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "식음료 내역 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<FnBItemListVO>>> selectFnBItemList(FnBItemListVO fnBItemListVO) throws Exception {
		ResponseVO<List<FnBItemListVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 식음료 내역 유효성 검사
		responseVO.setResponse(fnBItemListService.selectFnBItemList(fnBItemListVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<FnBItemListVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 식음료 내역 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updateFnBItemList(FnBItemListVO fnBItemListVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 식음료 내역 유효성 검사
		if (fnBItemListService.updateFnBItemList(fnBItemListVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 식음료 내역 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteFnBItemList(FnBItemListVO fnBItemListVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 식음료 내역 유효성 검사
		if (fnBItemListService.deleteFnBItemList(fnBItemListVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
