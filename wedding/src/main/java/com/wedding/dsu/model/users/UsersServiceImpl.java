package com.wedding.dsu.model.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.UsersMapper;

/**
 * 사용자 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.05 v0.1
 */
@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	UsersMapper usersMapper;

	/**
	 * 사용자 삽입
	 * 
	 * @param ContractCustomersVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertUser(UsersVO usersVO) throws Exception {
		return usersMapper.insertUser(usersVO);
	}

	/**
	 * 사용자 리스트 조회
	 * 
	 * @param UsersVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<UsersVO> selectUsers(UsersVO usersVO) throws Exception {
		return usersMapper.selectUsers(usersVO);
	}

	/**
	 * 사용자 상세 조회
	 * 
	 * @param UsersVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public UsersVO selectUser(UsersVO usersVO) throws Exception {
		return usersMapper.selectUser(usersVO);
	}

	/**
	 * 사용자 수정
	 * 
	 * @param UsersVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateUsers(UsersVO usersVO) throws Exception {
		return usersMapper.updateUsers(usersVO);
	}

	/**
	 * 사용자 삭제
	 * 
	 * @param UsersVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteUsers(UsersVO usersVO) throws Exception {
		return usersMapper.deleteUsers(usersVO);
	}

}
