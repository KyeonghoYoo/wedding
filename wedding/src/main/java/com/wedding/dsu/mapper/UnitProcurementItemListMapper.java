package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.unitprocurementitemlist.UnitProcurementItemListVO;

/**
 * 부대품목 내역 Mapper
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1
 */
public interface UnitProcurementItemListMapper {
	/**
	 * 부대품목 내역 등록
	 * 
	 * @param unitProcurementItemListVO
	 * @return
	 * @throws Exception
	 */
	public int insertUnitProcurementItemList(UnitProcurementItemListVO unitProcurementItemListVO) throws Exception;

	/**
	 * 부대품목 내역 리스트 조회
	 * 
	 * @param unitProcurementItemListVO
	 * @return
	 * @throws Exception
	 */
	public List<UnitProcurementItemListVO> selectUnitProcurementItemList(UnitProcurementItemListVO unitProcurementItemListVO) throws Exception;

	/**
	 * 부대품목 내역 수정
	 * 
	 * @param UnitProcurementItemListVO
	 * @return
	 * @throws Exception
	 */
	public int updateUnitProcurementItemList(UnitProcurementItemListVO unitProcurementItemListVO) throws Exception;

	/**
	 * 부대품목 내역 삭제
	 * 
	 * @param UnitProcurementItemListVO
	 * @return
	 * @throws Exception
	 */
	public int deleteUnitProcurementItemList(UnitProcurementItemListVO unitProcurementItemListVO) throws Exception;
}
