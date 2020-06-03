package com.wedding.dsu.model.users;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 사용자 VO
 * @author 유경호
 * @version 2019.08.05 v0.1
 * */
@Getter @Setter @ToString
public class UsersVO {
    private String id;
    @NotNull(message = "accountID는 null이 될 수 없습니다.")
    private String accountID;
    @NotNull(message = "password는 null이 될 수 없습니다.")
    private String password;
    private String grade;
    private String userName;
    private String mobile;
    private String contactNumber;
    @Email(message = "이메일 양식이 맞지 않습니다.")
    private String email;
    private String responsibility;
}
