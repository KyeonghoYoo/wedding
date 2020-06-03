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
import com.wedding.dsu.model.unitprocurementitems.UnitProcurementItemsItemClassificationsJoinVO;
import com.wedding.dsu.model.unitprocurementitems.UnitProcurementItemsService;
import com.wedding.dsu.model.unitprocurementitems.UnitProcurementItemsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 부대품목 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@RestController
@RequestMapping("/unitprocurementitems")
@Api(value = "UnitProcurementItemsController", description = "부대품목 API")
public class UnitProcurementItemsController {
	@Autowired
	UnitProcurementItemsService UnitProcurementItemsService;

	/**
	 * 부대품목 삽입 Controller
	 * 
	 * @param UnitProcurementItemsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "부대품목 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<UnitProcurementItemsVO>> insertUnitProcurementItem(@RequestBody UnitProcurementItemsVO UnitProcurementItemsVO) throws Exception {
		ResponseVO<UnitProcurementItemsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 부대품목 유효성 검사

		// DSU2019_Backend 부대품목 데이터 삽입
		if (UnitProcurementItemsService.insertUnitProcurementItem(UnitProcurementItemsVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<UnitProcurementItemsVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(UnitProcurementItemsVO);
		return new ResponseEntity<ResponseVO<UnitProcurementItemsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 부대품목 리스트 조회 Controller
	 * 
	 * @param UnitProcurementItemsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "부대품목 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<UnitProcurementItemsItemClassificationsJoinVO>>> selectUnitProcurementItems(UnitProcurementItemsVO UnitProcurementItemsVO) throws Exception {
		ResponseVO<List<UnitProcurementItemsItemClassificationsJoinVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 부대품목 유효성 검사
		responseVO.setResponse(UnitProcurementItemsService.selectUnitProcurementItems(UnitProcurementItemsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<UnitProcurementItemsItemClassificationsJoinVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 부대품목 단일 조회 Controller
	 * 
	 * @param UnitProcurementItemsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "부대품목 단일 조회", httpMethod = "GET")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<UnitProcurementItemsItemClassificationsJoinVO>> selectUnitProcurementItem(UnitProcurementItemsVO UnitProcurementItemsVO) throws Exception {
		ResponseVO<UnitProcurementItemsItemClassificationsJoinVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 부대품목 유효성 검사
		responseVO.setResponse(UnitProcurementItemsService.selectUnitProcurementItem(UnitProcurementItemsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<UnitProcurementItemsItemClassificationsJoinVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 부대품목 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updateUnitProcurementItem(UnitProcurementItemsVO UnitProcurementItemsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 부대품목 유효성 검사
		if (UnitProcurementItemsService.updateUnitProcurementItem(UnitProcurementItemsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 부대품목 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteUnitProcurementItem(UnitProcurementItemsVO UnitProcurementItemsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 부대품목 유효성 검사
		if (UnitProcurementItemsService.deleteUnitProcurementItem(UnitProcurementItemsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
