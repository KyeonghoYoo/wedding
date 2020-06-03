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
import com.wedding.dsu.model.paymentdetails.PaymentDetailsService;
import com.wedding.dsu.model.paymentdetails.PaymentDetailsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 입금내역 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@RestController
@RequestMapping("/paymentdetails")
@Api(value = "PaymentDetailsController", description = "거래내역 API")
public class PaymentDetailsController {
	@Autowired
	PaymentDetailsService paymentDetailsService;

	/**
	 * 입금내역 삽입 Controller
	 * 
	 * @param paymentDetailsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "입금내역 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<PaymentDetailsVO>> insertPaymentDetail(@RequestBody PaymentDetailsVO paymentDetailsVO) throws Exception {
		ResponseVO<PaymentDetailsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 입금내역 유효성 검사

		// DSU2019_Backend 입금내역 데이터 삽입
		if (paymentDetailsService.insertPaymentDetail(paymentDetailsVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<PaymentDetailsVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(paymentDetailsVO);
		return new ResponseEntity<ResponseVO<PaymentDetailsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 입금내역 리스트 조회 Controller
	 * 
	 * @param paymentDetailsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "입금내역 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<PaymentDetailsVO>>> selectPaymentDetails(PaymentDetailsVO paymentDetailsVO) throws Exception {
		ResponseVO<List<PaymentDetailsVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 입금내역 유효성 검사
		responseVO.setResponse(paymentDetailsService.selectPaymentDetails(paymentDetailsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<PaymentDetailsVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 입금내역 단일 조회 Controller
	 * 
	 * @param paymentDetailsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "입금내역 단일 조회", httpMethod = "GET")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<PaymentDetailsVO>> selectPaymentDetail(PaymentDetailsVO paymentDetailsVO) throws Exception {
		ResponseVO<PaymentDetailsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 입금내역 유효성 검사
		responseVO.setResponse(paymentDetailsService.selectPaymentDetail(paymentDetailsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<PaymentDetailsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 입금내역 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updatePaymentDetail(String id, @RequestBody PaymentDetailsVO paymentDetailsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		paymentDetailsVO.setId(id);
		// DSU2019_Backend 입금내역 유효성 검사
		if (paymentDetailsService.updatePaymentDetail(paymentDetailsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 입금내역 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deletePaymentDetail(PaymentDetailsVO paymentDetailsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 입금내역 유효성 검사
		if (paymentDetailsService.deletePaymentDetail(paymentDetailsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
