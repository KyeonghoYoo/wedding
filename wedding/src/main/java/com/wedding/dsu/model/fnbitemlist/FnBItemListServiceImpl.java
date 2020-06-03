package com.wedding.dsu.model.fnbitemlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.FnBItemListMapper;

/**
 * 식음료 내역 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1
 */
@Service
public class FnBItemListServiceImpl implements FnBItemListService {
	@Autowired
	FnBItemListMapper fnBItemListMapper;

	/**
	 * 식음료 내역 삽입
	 * 
	 * @param fnBItemListVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertFnBItemList(FnBItemListVO fnBItemListVO) throws Exception {
		return fnBItemListMapper.insertFnBItemList(fnBItemListVO);
	}

	/**
	 * 식음료 내역 리스트 조회
	 * 
	 * @param fnBItemListVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<FnBItemListVO> selectFnBItemList(FnBItemListVO fnBItemListVO)
			throws Exception {
		return fnBItemListMapper.selectFnBItemList(fnBItemListVO);
	}

	/**
	 * 식음료 내역 수정
	 * 
	 * @param fnBItemListVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateFnBItemList(FnBItemListVO fnBItemListVO) throws Exception {
		return fnBItemListMapper.updateFnBItemList(fnBItemListVO);
	}

	/**
	 * 식음료 내역 삭제
	 * 
	 * @param fnBItemListVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteFnBItemList(FnBItemListVO fnBItemListVO) throws Exception {
		return fnBItemListMapper.deleteFnBItemList(fnBItemListVO);
	}

}
