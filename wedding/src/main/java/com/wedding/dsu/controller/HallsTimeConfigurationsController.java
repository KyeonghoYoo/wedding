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
import com.wedding.dsu.model.hallstimeconfigurations.HallsTimeConfigurationsService;
import com.wedding.dsu.model.hallstimeconfigurations.HallsTimeConfigurationsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 홀시간관리 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@RestController
@RequestMapping("/hallstimeconfigurations")
@Api(value = "HallsTimeConfigurationsController", description = "홀 시간관리 API")
public class HallsTimeConfigurationsController {
	@Autowired
	HallsTimeConfigurationsService HallsTimeConfigurationsService;

	/**
	 * 홀시간관리 삽입 Controller
	 * 
	 * @param hallsTimeConfigurationsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "홀시간관리 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<HallsTimeConfigurationsVO>> insertHallsTimeConfiguration(@RequestBody HallsTimeConfigurationsVO hallsTimeConfigurationsVO) throws Exception {
		ResponseVO<HallsTimeConfigurationsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 홀시간관리 유효성 검사

		// DSU2019_Backend 홀시간관리 데이터 삽입
		if (HallsTimeConfigurationsService.insertHallsTimeConfiguration(hallsTimeConfigurationsVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<HallsTimeConfigurationsVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(hallsTimeConfigurationsVO);
		return new ResponseEntity<ResponseVO<HallsTimeConfigurationsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 홀시간관리 리스트 조회 Controller
	 * 
	 * @param hallsTimeConfigurationsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "홀시간관리 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<HallsTimeConfigurationsVO>>> selectHallsTimeConfigurations(HallsTimeConfigurationsVO hallsTimeConfigurationsVO) throws Exception {
		ResponseVO<List<HallsTimeConfigurationsVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 홀시간관리 유효성 검사
		responseVO.setResponse(HallsTimeConfigurationsService.selectHallsTimeConfigurations(hallsTimeConfigurationsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<HallsTimeConfigurationsVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 홀시간관리 단일 조회 Controller
	 * 
	 * @param hallsTimeConfigurationsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "홀시간관리 단일 조회", httpMethod = "GET")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<HallsTimeConfigurationsVO>> selectHallsTimeConfiguration(HallsTimeConfigurationsVO hallsTimeConfigurationsVO) throws Exception {
		ResponseVO<HallsTimeConfigurationsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 홀시간관리 유효성 검사
		responseVO.setResponse(HallsTimeConfigurationsService.selectHallsTimeConfiguration(hallsTimeConfigurationsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<HallsTimeConfigurationsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 홀시간관리 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updateHallsTimeConfiguration(String id, @RequestBody HallsTimeConfigurationsVO hallsTimeConfigurationsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		hallsTimeConfigurationsVO.setId(id);
		// DSU2019_Backend 홀시간관리 유효성 검사
		if (HallsTimeConfigurationsService.updateHallsTimeConfiguration(hallsTimeConfigurationsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 홀시간관리 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteHallsTimeConfiguration(HallsTimeConfigurationsVO hallsTimeConfigurationsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 홀시간관리 유효성 검사
		if (HallsTimeConfigurationsService.deleteHallsTimeConfiguration(hallsTimeConfigurationsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
