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
import com.wedding.dsu.model.itemclassifications.ItemClassificationsService;
import com.wedding.dsu.model.itemclassifications.ItemClassificationsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 부대품목분류 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@RestController
@RequestMapping("/itemclassifications")
@Api(value = "ItemClassificationsController", description = "아이템분류 API")
public class ItemClassificationsController {
	@Autowired
	ItemClassificationsService itemClassificationsService;

	/**
	 * 부대품목분류 삽입 Controller
	 * 
	 * @param ItemClassificationsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "부대품목분류 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<ItemClassificationsVO>> insertItemClassification(@RequestBody ItemClassificationsVO ItemClassificationsVO) throws Exception {
		ResponseVO<ItemClassificationsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 부대품목분류 유효성 검사

		// DSU2019_Backend 부대품목분류 데이터 삽입
		if (itemClassificationsService.insertItemClassification(ItemClassificationsVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<ItemClassificationsVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(ItemClassificationsVO);
		return new ResponseEntity<ResponseVO<ItemClassificationsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 부대품목분류 리스트 조회 Controller
	 * 
	 * @param ItemClassificationsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "부대품목분류 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<ItemClassificationsVO>>> selectItemClassifications(ItemClassificationsVO ItemClassificationsVO) throws Exception {
		ResponseVO<List<ItemClassificationsVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 부대품목분류 유효성 검사
		responseVO.setResponse(itemClassificationsService.selectItemClassifications(ItemClassificationsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<ItemClassificationsVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 부대품목분류 단일 조회 Controller
	 * 
	 * @param ItemClassificationsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "부대품목분류 단일 조회", httpMethod = "GET")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<ItemClassificationsVO>> selectItemClassification(ItemClassificationsVO ItemClassificationsVO) throws Exception {
		ResponseVO<ItemClassificationsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 부대품목분류 유효성 검사
		responseVO.setResponse(itemClassificationsService.selectItemClassification(ItemClassificationsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<ItemClassificationsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 부대품목분류 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updateItemClassification(ItemClassificationsVO ItemClassificationsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 부대품목분류 유효성 검사
		if (itemClassificationsService.updateItemClassification(ItemClassificationsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 부대품목분류 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteItemClassification(ItemClassificationsVO ItemClassificationsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 부대품목분류 유효성 검사
		if (itemClassificationsService.deleteItemClassification(ItemClassificationsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
