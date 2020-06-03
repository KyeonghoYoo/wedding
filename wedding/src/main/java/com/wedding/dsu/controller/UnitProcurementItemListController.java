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
import com.wedding.dsu.model.unitprocurementitemlist.UnitProcurementItemListService;
import com.wedding.dsu.model.unitprocurementitemlist.UnitProcurementItemListVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 부대품목 내역 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@RestController
@RequestMapping("/unitprocurementitemlist")
@Api(value = "UnitProcurementItemListController", description = "부대품목내역 API")
public class UnitProcurementItemListController {
	@Autowired
	UnitProcurementItemListService unitProcurementItemListService;

	/**
	 * 부대품목 내역 삽입 Controller
	 * 
	 * @param unitProcurementItemListVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "부대품목 내역 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<UnitProcurementItemListVO>> insertUnitProcurementItemList(@RequestBody UnitProcurementItemListVO unitProcurementItemListVO) throws Exception {
		ResponseVO<UnitProcurementItemListVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 부대품목 내역 유효성 검사

		// DSU2019_Backend 부대품목 내역 데이터 삽입
		if (unitProcurementItemListService.insertUnitProcurementItemList(unitProcurementItemListVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<UnitProcurementItemListVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(unitProcurementItemListVO);
		return new ResponseEntity<ResponseVO<UnitProcurementItemListVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 부대품목 내역 조회 Controller
	 * 
	 * @param unitProcurementItemListVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "부대품목 내역 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<UnitProcurementItemListVO>>> selectUnitProcurementItemList(UnitProcurementItemListVO unitProcurementItemListVO) throws Exception {
		ResponseVO<List<UnitProcurementItemListVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 부대품목 내역 유효성 검사
		responseVO.setResponse(unitProcurementItemListService.selectUnitProcurementItemList(unitProcurementItemListVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<UnitProcurementItemListVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 부대품목 내역 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updateUnitProcurementItemList(UnitProcurementItemListVO unitProcurementItemListVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 부대품목 내역 유효성 검사
		if (unitProcurementItemListService.updateUnitProcurementItemList(unitProcurementItemListVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 부대품목 내역 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteUnitProcurementItemList(UnitProcurementItemListVO unitProcurementItemListVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 부대품목 내역 유효성 검사
		if (unitProcurementItemListService.deleteUnitProcurementItemList(unitProcurementItemListVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
