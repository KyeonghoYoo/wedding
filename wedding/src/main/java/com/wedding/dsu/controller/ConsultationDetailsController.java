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
import com.wedding.dsu.model.consultationdetails.ConsultationDetailsService;
import com.wedding.dsu.model.consultationdetails.ConsultationDetailsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 상담내역 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@RestController
@RequestMapping("/consultationdetails")
@Api(value = "ConsultationDetailsController", description = "상담내역 API")
public class ConsultationDetailsController {
	@Autowired
	ConsultationDetailsService consultationDetailsService;

	/**
	 * 상담내역 삽입 Controller
	 * 
	 * @param consultationDetailsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "상담내역 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<ConsultationDetailsVO>> insertConsultationDetail(@RequestBody ConsultationDetailsVO consultationDetailsVO) throws Exception {
		ResponseVO<ConsultationDetailsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 입금내역 유효성 검사

		// DSU2019_Backend 입금내역 데이터 삽입
		if (consultationDetailsService.insertConsultationDetail(consultationDetailsVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<ConsultationDetailsVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(consultationDetailsVO);
		return new ResponseEntity<ResponseVO<ConsultationDetailsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 상담내역 리스트 조회 Controller
	 * 
	 * @param consultationDetailsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "상담내역 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<ConsultationDetailsVO>>> selectConsultationDetails(ConsultationDetailsVO consultationDetailsVO) throws Exception {
		ResponseVO<List<ConsultationDetailsVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 입금내역 유효성 검사
		responseVO.setResponse(consultationDetailsService.selectConsultationDetails(consultationDetailsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<ConsultationDetailsVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 상담내역 단일 조회 Controller
	 * 
	 * @param consultationDetailsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "상담내역 단일 조회", httpMethod = "GET")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<ConsultationDetailsVO>> selectConsultationDetail(ConsultationDetailsVO consultationDetailsVO) throws Exception {
		ResponseVO<ConsultationDetailsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 입금내역 유효성 검사
		responseVO.setResponse(consultationDetailsService.selectConsultationDetail(consultationDetailsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<ConsultationDetailsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 상담내역 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updateConsultationDetail(@PathVariable String id, @RequestBody ConsultationDetailsVO consultationDetailsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 입금내역 유효성 검사
		consultationDetailsVO.setId(id);
		if (consultationDetailsService.updateConsultationDetail(consultationDetailsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 상담내역 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteConsultationDetail(ConsultationDetailsVO consultationDetailsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 입금내역 유효성 검사
		if (consultationDetailsService.deleteConsultationDetail(consultationDetailsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
