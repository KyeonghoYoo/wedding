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
import com.wedding.dsu.model.consultationcustomers.ConsultationCustomersSearchVO;
import com.wedding.dsu.model.consultationcustomers.ConsultationCustomersService;
import com.wedding.dsu.model.consultationcustomers.ConsultationCustomersVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 상담고객 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@RestController
@RequestMapping("/consultationcustomers")
@Api(value = "ConsultationCustomersController", description = "상담고객 API")
public class ConsultationCustomersController {
	@Autowired
	ConsultationCustomersService consultationCustomersService;

	/**
	 * 상담고객 삽입 Controller
	 * 
	 * @param ConsultationCustomersVO consultationCustomerVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "상담고객 삽입", notes = "상담고객 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<ConsultationCustomersVO>> insertConsultationCustomer(@RequestBody ConsultationCustomersVO ConsultationCustomersVO)
			throws Exception {
		ResponseVO<ConsultationCustomersVO> responseVO = new ResponseVO<>();
		// CLASS_SELLING_PM_1.1.1  유효성 검사

		// CLASS_SELLING_PM_1.1.2  데이터 삽입
		if (consultationCustomersService.insertConsultationCustomer(ConsultationCustomersVO) == 0) {
			// CLASS_SELLING_PM_1.1.3 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<ConsultationCustomersVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(ConsultationCustomersVO);
		return new ResponseEntity<ResponseVO<ConsultationCustomersVO>>(responseVO, HttpStatus.OK);
	}
	/**
	 * 상담고객 리스트 조회 Controller
	 * 
	 * @param ConsultationCustomersVO consultationCustomerVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "상담고객 리스트 조회", notes = "상담고객 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<ConsultationCustomersVO>>> selectConsultationCustomers(ConsultationCustomersSearchVO ConsultationCustomersSearchVO)
			throws Exception {
		ResponseVO<List<ConsultationCustomersVO>> responseVO = new ResponseVO<>();
		// CLASS_SELLING_PM_1.1.1  유효성 검사
		responseVO.setResponse(consultationCustomersService.selectConsultationCustomers(ConsultationCustomersSearchVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<ConsultationCustomersVO>>>(responseVO, HttpStatus.OK);
	}
	/**
	 * 상담고객 단일 조회 Controller
	 * 
	 * @param ConsultationCustomersVO consultationCustomerVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "상담고객 상세 조회", notes = "상담고객 상세 조회", httpMethod = "GET")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<ConsultationCustomersVO>> selectConsultationCustomer(ConsultationCustomersVO ConsultationCustomersVO)
			throws Exception {
		ResponseVO<ConsultationCustomersVO> responseVO = new ResponseVO<>();
		// CLASS_SELLING_PM_1.1.1  유효성 검사
		responseVO.setResponse(consultationCustomersService.selectConsultationCustomer(ConsultationCustomersVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<ConsultationCustomersVO>>(responseVO, HttpStatus.OK);
	}
	/**
	 * 상담고객 수정 Controller
	 * 
	 * @param ConsultationCustomersVO consultationCustomerVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "상담고객 수정", notes = "상담고객 수정", httpMethod = "PUT")
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updateConsultationCustomer(String id, @RequestBody ConsultationCustomersVO consultationCustomerVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 홀 유효성 검사
		consultationCustomerVO.setId(id);
		if (consultationCustomersService.updateConsultationCustomer(consultationCustomerVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
	/**
	 * 상담고객 삭제 Controller
	 * 
	 * @param ConsultationCustomersVO consultationCustomerVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "상담고객 삭제", notes = "상담고객 삭제", httpMethod = "DELETE")
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteConsultationCustomer(ConsultationCustomersVO ConsultationCustomerVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 홀 유효성 검사
		if (consultationCustomersService.deleteConsultationCustomer(ConsultationCustomerVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
