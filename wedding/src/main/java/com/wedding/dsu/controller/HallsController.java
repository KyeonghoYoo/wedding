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
import com.wedding.dsu.model.halls.HallsService;
import com.wedding.dsu.model.halls.HallsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 홀 API
 * 
 * @author 유경호
 * @version 2019.10.02 v0.2
 */
@RestController
@RequestMapping("/halls")
@Api(value = "HallsController", description = "홀 API")
public class HallsController {
	@Autowired
	HallsService hallsService;

	/**
	 * 홀 삽입 Controller
	 * 
	 * @param hallsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "홀 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<HallsVO>> insertHall(@RequestBody HallsVO hallsVO) throws Exception {
		ResponseVO<HallsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 홀 유효성 검사

		// DSU2019_Backend 홀 데이터 삽입
		if (hallsService.insertHalls(hallsVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<HallsVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(hallsVO);
		return new ResponseEntity<ResponseVO<HallsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 홀 리스트 조회 Controller
	 * 
	 * @param hallsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "홀 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<HallsVO>>> selectHalls(HallsVO hallsVO) throws Exception {
		ResponseVO<List<HallsVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 홀 유효성 검사
		responseVO.setResponse(hallsService.selectHalls(hallsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<HallsVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 홀 단일 조회 Controller
	 * 
	 * @param hallsVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "홀 단일 조회", httpMethod = "GET")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<HallsVO>> selectHall(HallsVO hallsVO) throws Exception {
		ResponseVO<HallsVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 홀 유효성 검사
		responseVO.setResponse(hallsService.selectHall(hallsVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<HallsVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 홀 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updateHall(HallsVO hallsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 홀 유효성 검사
		if (hallsService.updateHalls(hallsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 홀 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteHall(HallsVO hallsVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 홀 유효성 검사
		if (hallsService.deleteHalls(hallsVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
