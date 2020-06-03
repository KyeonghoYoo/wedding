package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.unitprocurementitems.UnitProcurementItemsItemClassificationsJoinVO;
import com.wedding.dsu.model.unitprocurementitems.UnitProcurementItemsVO;

/**
 * 부대품목 Mapper
 * 
 * @author 유경호
 * @version 2019.08.06 v0.1
 */
public interface UnitProcurementItemsMapper {
	/**
	 * 부대품목 등록
	 * 
	 * @param UnitProcurementItemsVO
	 * @return
	 * @throws Exception
	 */
	public int insertUnitProcurementItem(UnitProcurementItemsVO unitProcurementItemsVO) throws Exception;

	/**
	 * 부대품목 리스트 조회
	 * 
	 * @param UnitProcurementItemsVO
	 * @return
	 * @throws Exception
	 */
	public List<UnitProcurementItemsItemClassificationsJoinVO> selectUnitProcurementItems(UnitProcurementItemsVO UnitProcurementItemsVO) throws Exception;

	/**
	 * 부대품목 상세 조회
	 * 
	 * @param UnitProcurementItemsVO
	 * @return
	 * @throws Exception
	 */
	public UnitProcurementItemsItemClassificationsJoinVO selectUnitProcurementItem(UnitProcurementItemsVO unitProcurementItemsVO) throws Exception;

	/**
	 * 부대품목 수정
	 * 
	 * @param UnitProcurementItemsVO
	 * @return
	 * @throws Exception
	 */
	public int updateUnitProcurementItem(UnitProcurementItemsVO unitProcurementItemsVO) throws Exception;

	/**
	 * 부대품목 삭제
	 * 
	 * @param UnitProcurementItemsVO
	 * @return
	 * @throws Exception
	 */
	public int deleteUnitProcurementItem(UnitProcurementItemsVO unitProcurementItemsVO) throws Exception;
}
