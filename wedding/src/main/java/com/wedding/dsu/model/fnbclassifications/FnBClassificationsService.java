package com.wedding.dsu.model.fnbclassifications;

import java.util.List;

/**
 * 식음료 Service Interface
 * 
 * @author 유경호
 * @version 2019.08.06 v0.1
 */
public interface FnBClassificationsService {
	/**
	 * 식음료 등록
	 * 
	 * @param FnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public int insertFnBClassification(FnBClassificationsVO fnBClassificationsVO) throws Exception;

	/**
	 * 식음료 리스트 조회
	 * 
	 * @param FnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public List<FnBClassificationsVO> selectFnBClassifications(FnBClassificationsVO FnBClassificationsVO) throws Exception;

	/**
	 * 식음료 상세 조회
	 * 
	 * @param FnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public FnBClassificationsVO selectFnBClassification(FnBClassificationsVO fnBClassificationsVO) throws Exception;

	/**
	 * 식음료 수정
	 * 
	 * @param FnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public int updateFnBClassification(FnBClassificationsVO fnBClassificationsVO) throws Exception;

	/**
	 * 식음료 삭제
	 * 
	 * @param FnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public int deleteFnBClassification(FnBClassificationsVO fnBClassificationsVO) throws Exception;
}
