package com.wedding.dsu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wedding.dsu.common.ResponseVO;

@Controller
public class StatusController {
	
	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<ResponseVO<String>> isRunning() throws Exception {
		
		ResponseVO<String> responseVO = new ResponseVO<>();
		responseVO.setCheck(true);
		responseVO.setMessage("앙~균환띠 선민띠 힘내래이");
		responseVO.setResponse("앙~기무띠!");
		
		return new ResponseEntity<ResponseVO<String>>(responseVO, HttpStatus.OK);
	}
}