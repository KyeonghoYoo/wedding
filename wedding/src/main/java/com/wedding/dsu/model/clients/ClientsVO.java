package com.wedding.dsu.model.clients;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class ClientsVO {
	@ApiModelProperty(value = "거래처 ID")
    private String id;
    @ApiModelProperty(value = "거래처 분류", allowableValues = "웨딩컨설팅,스튜디오,드레스,메이크업,기타")
    private String clientClassification;
    @ApiModelProperty(value = "업체명")
    private String name;
    @ApiModelProperty(value = "담당자 이름")
    private String userName;
    @ApiModelProperty(value = "핸드폰 번호")
    private String mobile;
    @ApiModelProperty(value = "전화번호")
    private String contactNumber;
    @ApiModelProperty(value = "FAX 번호")
    private String faxNumber;
    @ApiModelProperty(value = "이메일")
    private String email;
    @ApiModelProperty(value = "비고")
    private String memo;
}
