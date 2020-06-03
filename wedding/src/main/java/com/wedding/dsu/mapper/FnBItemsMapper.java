package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.fnbitems.FnBItemsFnbclassificationsJoinVO;
import com.wedding.dsu.model.fnbitems.FnBItemsVO;

/**
 * 식음료 Mapper
 * 
 * @author 유경호
 * @version 2019.10.07 v0.2
 */
public interface FnBItemsMapper {
	/**
	 * 식음료 등록
	 * 
	 * @param FnBItemsVO
	 * @return
	 * @throws Exception
	 */
	public int insertFnBItem(FnBItemsVO fnBItemsVO) throws Exception;

	/**
	 * 식음료 리스트 조회
	 * 
	 * @param FnBItemsVO
	 * @return
	 * @throws Exception
	 */
	public List<FnBItemsFnbclassificationsJoinVO> selectFnBItems(FnBItemsVO fnBItemsVO) throws Exception;

	/**
	 * 식음료 상세 조회
	 * 
	 * @param FnBItemsVO
	 * @return
	 * @throws Exception
	 */
	public FnBItemsFnbclassificationsJoinVO selectFnBItem(FnBItemsVO fnBItemsVO) throws Exception;

	/**
	 * 식음료 수정
	 * 
	 * @param FnBItemsVO
	 * @return
	 * @throws Exception
	 */
	public int updateFnBItem(FnBItemsVO fnBItemsVO) throws Exception;

	/**
	 * 식음료 삭제
	 * 
	 * @param FnBItemsVO
	 * @return
	 * @throws Exception
	 */
	public int deleteFnBItem(FnBItemsVO fnBItemsVO) throws Exception;
}
