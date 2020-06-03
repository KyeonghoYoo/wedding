package com.wedding.dsu.common;

import org.springframework.http.HttpStatus;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 응답 VO
 * @author 유경호
 * @version 2019.08.01 v0.1
 * */
@Getter @Setter @ToString
@ApiModel(value = "ResponseVO", description = "리스폰스 모델")
public class ResponseVO<T> {
	@ApiModelProperty(value = "상태코드")
	private int code = HttpStatus.OK.value();
	@ApiModelProperty(value = "메세지")
	private String message;
	@ApiModelProperty(value = "성공여부")
	private boolean check = true;
	@ApiModelProperty(value = "json 데이터")
	private T response;
}
