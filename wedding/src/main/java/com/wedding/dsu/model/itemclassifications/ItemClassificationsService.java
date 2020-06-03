package com.wedding.dsu.model.itemclassifications;

import java.util.List;

import com.wedding.dsu.model.itemclassifications.ItemClassificationsVO;

/**
 * 부대품목분류 Service Interface
 * 
 * @author 유경호
 * @version 2019.08.06 v0.1
 */
public interface ItemClassificationsService {
	/**
	 * 부대품목분류 등록
	 * 
	 * @param ItemClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public int insertItemClassification(ItemClassificationsVO itemClassificationsVO) throws Exception;

	/**
	 * 부대품목분류 리스트 조회
	 * 
	 * @param ItemClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public List<ItemClassificationsVO> selectItemClassifications(ItemClassificationsVO itemClassificationsVO) throws Exception;

	/**
	 * 부대품목분류 상세 조회
	 * 
	 * @param ItemClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public ItemClassificationsVO selectItemClassification(ItemClassificationsVO itemClassificationsVO) throws Exception;

	/**
	 * 부대품목분류 수정
	 * 
	 * @param ItemClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public int updateItemClassification(ItemClassificationsVO itemClassificationsVO) throws Exception;

	/**
	 * 부대품목분류 삭제
	 * 
	 * @param ItemClassificationsVO
	 * @return
	 * @throws Exception
	 */
	public int deleteItemClassification(ItemClassificationsVO itemClassificationsVO) throws Exception;
}
