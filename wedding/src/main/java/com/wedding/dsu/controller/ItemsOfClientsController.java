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
import com.wedding.dsu.model.itemsofclients.ItemsOfClientsService;
import com.wedding.dsu.model.itemsofclients.ItemsOfClientsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 거래처 아이템 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@RestController
@RequestMapping("/itemsofclients")
@Api(value = "ItemsOfClientsController", description = "거래처 아이템 API")
public class ItemsOfClientsController {
	@Autowired
	ItemsOfClientsService itemsOfClientsService;

	/**
	 * 거래처 아이템 삽입 Controller
	 * 
	 * @param itemsOfClientsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "거래처 아이템 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<ItemsOfClientsVO>> insertItemsOfClient(@RequestBody ItemsOfClientsVO itemsOfClientsVO) throws Exception {
		ResponseVO<ItemsOfClientsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처 아이템 유효성 검사

		// DSU2019_Backend 거래처 아이템 데이터 삽입
		if (itemsOfClientsService.insertItemsOfClient(itemsOfClientsVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<ItemsOfClientsVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(itemsOfClientsVO);
		return new ResponseEntity<ResponseVO<ItemsOfClientsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 거래처 아이템 리스트 조회 Controller
	 * 
	 * @param itemsOfClientsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "거래처 아이템 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<ItemsOfClientsVO>>> selectItemsOfClients(ItemsOfClientsVO itemsOfClientsVO) throws Exception {
		ResponseVO<List<ItemsOfClientsVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처 아이템 유효성 검사
		responseVO.setResponse(itemsOfClientsService.selectItemsOfClients(itemsOfClientsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<ItemsOfClientsVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 거래처 아이템 단일 조회 Controller
	 * 
	 * @param itemsOfClientsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "거래처 아이템 단일 조회", httpMethod = "GET")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<ItemsOfClientsVO>> selectItemsOfClient(ItemsOfClientsVO itemsOfClientsVO) throws Exception {
		ResponseVO<ItemsOfClientsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처 아이템 유효성 검사
		responseVO.setResponse(itemsOfClientsService.selectItemsOfClient(itemsOfClientsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<ItemsOfClientsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 거래처 아이템 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updateItemsOfClient(ItemsOfClientsVO itemsOfClientsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처 아이템 유효성 검사
		if (itemsOfClientsService.updateItemsOfClient(itemsOfClientsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 거래처 아이템 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteItemsOfClient(ItemsOfClientsVO itemsOfClientsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처 아이템 유효성 검사
		if (itemsOfClientsService.deleteItemsOfClient(itemsOfClientsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
