package com.wedding.dsu.model.unitprocurementitemlist;

import java.util.List;

/**
 * 결제내역 Service Interface
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1
 */
public interface UnitProcurementItemListService {
	/**
	 * 부대품목 내역 등록
	 * 
	 * @param UnitProcurementItemListVO
	 * @return
	 * @throws Exception
	 */
	public int insertUnitProcurementItemList(UnitProcurementItemListVO unitProcurementItemListVO) throws Exception;

	/**
	 * 부대품목 내역 리스트 조회
	 * 
	 * @param UnitProcurementItemListVO
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
