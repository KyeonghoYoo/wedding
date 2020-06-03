package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.fnbclassifications.FnBClassificationsVO;

/**
 * 식음료분류 Mapper
 * 
 * @author 유경호
 * @version 2019.08.06 v0.1
 */
public interface FnBClassificationsMapper {
	/**
	 * 식음료분류 등록
	 * 
	 * @param FnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public int insertFnBClassification(FnBClassificationsVO FnBClassificationsVO) throws Exception;

	/**
	 * 식음료분류 리스트 조회
	 * 
	 * @param FnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public List<FnBClassificationsVO> selectFnBClassifications(FnBClassificationsVO FnBClassificationsVO) throws Exception;

	/**
	 * 식음료분류 상세 조회
	 * 
	 * @param FnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public FnBClassificationsVO selectFnBClassification(FnBClassificationsVO FnBClassificationsVO) throws Exception;

	/**
	 * 식음료분류 수정
	 * 
	 * @param FnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public int updateFnBClassification(FnBClassificationsVO FnBClassificationsVO) throws Exception;

	/**
	 * 식음료분류 삭제
	 * 
	 * @param FnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public int deleteFnBClassification(FnBClassificationsVO FnBClassificationsVO) throws Exception;
}
