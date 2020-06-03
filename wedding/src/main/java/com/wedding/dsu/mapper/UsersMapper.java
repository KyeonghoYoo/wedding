package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.users.UsersVO;

/**
 * 사용자 Mapper
 * 
 * @author 유경호
 * @version 2019.08.05 v0.1
 */
public interface UsersMapper {
	/**
	 * 사용자 등록
	 * 
	 * @param UsersVO
	 * @return
	 * @throws Exception
	 */
	public int insertUser(UsersVO usersVO) throws Exception;

	/**
	 * 사용자 리스트 조회
	 * 
	 * @param UsersVO
	 * @return
	 * @throws Exception
	 */
	public List<UsersVO> selectUsers(UsersVO usersVO) throws Exception;

	/**
	 * 사용자 상세 조회
	 * 
	 * @param UsersVO
	 * @return
	 * @throws Exception
	 */
	public UsersVO selectUser(UsersVO usersVO) throws Exception;

	/**
	 * 사용자 수정
	 * 
	 * @param UsersVO
	 * @return
	 * @throws Exception
	 */
	public int updateUsers(UsersVO usersVO) throws Exception;

	/**
	 * 사용자 삭제
	 * 
	 * @param UsersVO
	 * @return
	 * @throws Exception
	 */
	public int deleteUsers(UsersVO usersVO) throws Exception;
}
