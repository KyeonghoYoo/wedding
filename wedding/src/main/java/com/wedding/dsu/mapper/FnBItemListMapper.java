package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.fnbitemlist.FnBItemListVO;

/**
 * 식음료 내역 Mapper
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1
 */
public interface FnBItemListMapper {
	/**
	 * 식음료 내역 등록
	 * 
	 * @param FnBItemListVO
	 * @return
	 * @throws Exception
	 */
	public int insertFnBItemList(FnBItemListVO fnBItemListVO) throws Exception;

	/**
	 * 식음료 내역 리스트 조회
	 * 
	 * @param FnBItemListVO
	 * @return
	 * @throws Exception
	 */
	public List<FnBItemListVO> selectFnBItemList(FnBItemListVO fnBItemListVO) throws Exception;

	/**
	 * 식음료 내역 수정
	 * 
	 * @param FnBItemListVO
	 * @return
	 * @throws Exception
	 */
	public int updateFnBItemList(FnBItemListVO fnBItemListVO) throws Exception;

	/**
	 * 식음료 내역 삭제
	 * 
	 * @param FnBItemListVO
	 * @return
	 * @throws Exception
	 */
	public int deleteFnBItemList(FnBItemListVO fnBItemListVO) throws Exception;
}
