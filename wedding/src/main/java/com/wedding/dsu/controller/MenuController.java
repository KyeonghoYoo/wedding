package com.wedding.dsu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedding.dsu.common.ResponseVO;
import com.wedding.dsu.model.menu.MenuService;
import com.wedding.dsu.model.menu.MenuVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 메뉴 API
 * 
 * @author 유경호
 * @version 2019.10.01 v0.2
 */
@RestController
@RequestMapping("/menu")
@Api(value = "MenuController", description = "메뉴 API")
public class MenuController {
	@Autowired
	MenuService menuService;

	/**
	 * 메뉴 삽입 Controller
	 * 
	 * @param menuVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "메뉴 삽입", httpMethod = "POST")
	@PostMapping
	public ResponseEntity<ResponseVO<MenuVO>> insertMenu(@RequestBody MenuVO menuVO) throws Exception {
		ResponseVO<MenuVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 메뉴 유효성 검사

		// DSU2019_Backend 메뉴 데이터 삽입
		if (menuService.insertMenu(menuVO) == 0) {
			// CLASS_SELLING_PM_1.1.3거래처 단일 삽입 결과 확인
			responseVO.setCode(HttpStatus.BAD_REQUEST.value());
			responseVO.setCheck(false);
			responseVO.setMessage("삽입 실패");
			return new ResponseEntity<ResponseVO<MenuVO>>(responseVO, HttpStatus.BAD_REQUEST);
		}
		responseVO.setMessage("삽입 성공");
		// 삽입된 row 전체를 VO로 반환
		responseVO.setResponse(menuVO);
		return new ResponseEntity<ResponseVO<MenuVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 메뉴 리스트 조회 Controller
	 * 
	 * @param menuVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "메뉴 리스트 조회", httpMethod = "GET")
	@GetMapping
	public ResponseEntity<ResponseVO<List<MenuVO>>> selectMenus(MenuVO menuVO) throws Exception {
		ResponseVO<List<MenuVO>> responseVO = new ResponseVO<>();
		// DSU2019_Backend 메뉴 유효성 검사
		responseVO.setResponse(menuService.selectMenus(menuVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<List<MenuVO>>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 메뉴 단일 조회 Controller
	 * 
	 * @param menuVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "", notes = "메뉴 단일 조회", httpMethod = "GET")
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<MenuVO>> selectMenu(MenuVO menuVO) throws Exception {
		ResponseVO<MenuVO> responseVO = new ResponseVO<>();
		// DSU2019_Backend 메뉴 유효성 검사
		responseVO.setResponse(menuService.selectMenu(menuVO));
		responseVO.setMessage("조회 성공");
		return new ResponseEntity<ResponseVO<MenuVO>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 메뉴 수정 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> updateMenu(MenuVO menuVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 메뉴 유효성 검사
		if (menuService.updateMenu(menuVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("수정 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("수정 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}

	/**
	 * 메뉴 삭제 Controller
	 * 
	 * @param String
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ResponseVO<String>> deleteMenu(MenuVO menuVO) throws Exception {
		ResponseVO<String> responseVO = new ResponseVO<>();
		// DSU2019_Backend 메뉴 유효성 검사
		if (menuService.deleteMenu(menuVO) == 0) {
			responseVO.setCheck(false);
			responseVO.setMessage("삭제 실패");
			responseVO.setResponse(null);
		}

		responseVO.setMessage("삭제 성공");
		responseVO.setResponse(null);
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}
