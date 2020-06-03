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
import com.wedding.dsu.model.clients.ClientsService;
import com.wedding.dsu.model.clients.ClientsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * 거래처 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@Slf4j
@RestController
@RequestMapping("/clients")
@Api(value = "/clients", description = "거래처 API")
public class ClientsController {
	@Autowired
	ClientsService clientsService;

	/**
	 * 거래처 삽입 Controller
	 * 
	 * @param ClientsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "거래처 삽입", notes = "거래처 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<ClientsVO>> insertClients(@RequestBody ClientsVO ClientsVO) throws Exception {
		ResponseVO<ClientsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처 유효성 검사

		// DSU2019_Backend 거래처 데이터 삽입
		if (clientsService.insertClient(ClientsVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<ClientsVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");

		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(ClientsVO);
		return new ResponseEntity<ResponseVO<ClientsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 거래처 리스트 조회 Controller
	 * 
	 * @param ClientsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "거래처 리스트 조회", notes = "거래처 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<ClientsVO>>> selectClientss(ClientsVO ClientsVO) throws Exception {
		ResponseVO<List<ClientsVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처 유효성 검사
		responseVO.setResponse(clientsService.selectClients(ClientsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<ClientsVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 거래처 단일 조회 Controller
	 * 
	 * @param ClientsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "거래처 단일 조회", notes = "거래처 단일 조회", httpMethod = "GET")
	@ApiImplicitParam(name = "id", value = "거래처 ID", required = true, dataType = "string", paramType = "query", example = "KRBS000001")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<ClientsVO>> selectClients(ClientsVO ClientsVO) throws Exception {
		ResponseVO<ClientsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처 유효성 검사
		responseVO.setResponse(clientsService.selectClient(ClientsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<ClientsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 거래처 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "거래처 수정", notes = "거래처 수정", httpMethod = "PUT")
	@PutMapping(value = "/{id}")
	@ApiImplicitParam(name = "id", value = "거래처 ID", required = true, dataType = "string", paramType = "query", example = "KRBS000001")
	public ResponseEntity<ResponseVO<String>> updateClients(ClientsVO ClientsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처 유효성 검사
		if (clientsService.updateClient(ClientsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 거래처 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "거래처 삭제", notes = "거래처 삭제", httpMethod = "DELETE")
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteClients(ClientsVO ClientsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 거래처 유효성 검사
		if (clientsService.deleteClient(ClientsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
