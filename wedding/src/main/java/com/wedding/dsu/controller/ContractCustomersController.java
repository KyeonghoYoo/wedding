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
import com.wedding.dsu.model.contractcustomers.ContractCustomersSearchVO;
import com.wedding.dsu.model.contractcustomers.ContractCustomersService;
import com.wedding.dsu.model.contractcustomers.ContractCustomersVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 계약고객 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@RestController
@RequestMapping("/contractcustomers")
@Api(value = "ContractCustomersController", description = "계약고객 API")
public class ContractCustomersController {
	@Autowired
	ContractCustomersService contractCustomersService;

	/**
	 * 계약고객 삽입 Controller
	 * 
	 * @param HallsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "계약고객 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<ContractCustomersVO>> insertContractCustomer(@RequestBody ContractCustomersVO contractCustomersVO)
			throws Exception {
		ResponseVO<ContractCustomersVO> responseVO = new ResponseVO<>();
		// CLASS_SELLING_PM_1.1.1  유효성 검사

		// CLASS_SELLING_PM_1.1.2  데이터 삽입
		if (contractCustomersService.insertContractCustomer(contractCustomersVO) == 0) {
			// CLASS_SELLING_PM_1.1.3 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<ContractCustomersVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(contractCustomersVO);
		return new ResponseEntity<ResponseVO<ContractCustomersVO>>(responseVO, HttpStatus.OK);
	}
	/**
	 * 계약고객 리스트 조회 Controller
	 * 
	 * @param ContractCustomersSearchVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "계약고객 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<ContractCustomersVO>>> selectContractCustomers(ContractCustomersSearchVO contractCustomersSearchVO)
			throws Exception {
		ResponseVO<List<ContractCustomersVO>> responseVO = new ResponseVO<>();
		// CLASS_SELLING_PM_1.1.1  유효성 검사
		responseVO.setResponse(contractCustomersService.selectContractCustomers(contractCustomersSearchVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<ContractCustomersVO>>>(responseVO, HttpStatus.OK);
	}
	/**
	 * 계약고객 단일 조회 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "계약고객 리스트 조회", httpMethod = "GET")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<ContractCustomersVO>> selectContractCustomer(ContractCustomersVO contractCustomersVO)
			throws Exception {
		ResponseVO<ContractCustomersVO> responseVO = new ResponseVO<>();
		// CLASS_SELLING_PM_1.1.1  유효성 검사
		responseVO.setResponse(contractCustomersService.selectContractCustomer(contractCustomersVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<ContractCustomersVO>>(responseVO, HttpStatus.OK);
	}
	/**
	 * 계약고객 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updateContractCustomer(@PathVariable String id, @RequestBody ContractCustomersVO contractCustomerVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 홀 유효성 검사
		contractCustomerVO.setId(id);
		if (contractCustomersService.updateContractCustomer(contractCustomerVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
	/**
	 * 계약고객 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteContractCustomer(ContractCustomersVO contractCustomerVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 홀 유효성 검사
		if (contractCustomersService.deleteContractCustomer(contractCustomerVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
