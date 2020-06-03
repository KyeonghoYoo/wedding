package com.wedding.dsu.model.fnbitems;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.FnBItemsMapper;

/**
 * 식음료 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.10.07 v0.2
 */
@Service
public class FnBItemsServiceImpl implements FnBItemsService {
	@Autowired
	FnBItemsMapper fnBItemsMapper;

	/**
	 * 식음료 삽입
	 * 
	 * @param fnBItemsVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertFnBItem(FnBItemsVO fnBItemsVO) throws Exception {
		return fnBItemsMapper.insertFnBItem(fnBItemsVO);
	}

	/**
	 * 식음료 리스트 조회
	 * 
	 * @param fnBItemsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<FnBItemsFnbclassificationsJoinVO> selectFnBItems(FnBItemsVO fnBItemsVO)
			throws Exception {
		return fnBItemsMapper.selectFnBItems(fnBItemsVO);
	}

	/**
	 * 식음료 상세 조회
	 * 
	 * @param fnBItemsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public FnBItemsFnbclassificationsJoinVO selectFnBItem(FnBItemsVO fnBItemsVO)
			throws Exception {
		return fnBItemsMapper.selectFnBItem(fnBItemsVO);
	}

	/**
	 * 식음료 수정
	 * 
	 * @param fnBItemsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateFnBItem(FnBItemsVO fnBItemsVO) throws Exception {
		return fnBItemsMapper.updateFnBItem(fnBItemsVO);
	}

	/**
	 * 식음료 삭제
	 * 
	 * @param fnBItemsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteFnBItem(FnBItemsVO fnBItemsVO) throws Exception {
		return fnBItemsMapper.deleteFnBItem(fnBItemsVO);
	}

}
