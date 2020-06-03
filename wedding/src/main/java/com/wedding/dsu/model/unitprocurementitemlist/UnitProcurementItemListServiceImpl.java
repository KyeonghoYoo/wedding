package com.wedding.dsu.model.unitprocurementitemlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.UnitProcurementItemListMapper;

/**
 * 부대품목 내역 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1
 */
@Service
public class UnitProcurementItemListServiceImpl implements UnitProcurementItemListService {
	@Autowired
	UnitProcurementItemListMapper unitProcurementItemListMapper;

	/**
	 * 부대품목 내역 삽입
	 * 
	 * @param unitProcurementItemListVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertUnitProcurementItemList(UnitProcurementItemListVO unitProcurementItemListVO) throws Exception {
		return unitProcurementItemListMapper.insertUnitProcurementItemList(unitProcurementItemListVO);
	}

	/**
	 * 부대품목 내역 리스트 조회
	 * 
	 * @param unitProcurementItemListVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<UnitProcurementItemListVO> selectUnitProcurementItemList(UnitProcurementItemListVO unitProcurementItemListVO)
			throws Exception {
		return unitProcurementItemListMapper.selectUnitProcurementItemList(unitProcurementItemListVO);
	}

	/**
	 * 부대품목 내역 수정
	 * 
	 * @param unitProcurementItemListVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateUnitProcurementItemList(UnitProcurementItemListVO unitProcurementItemListVO) throws Exception {
		return unitProcurementItemListMapper.updateUnitProcurementItemList(unitProcurementItemListVO);
	}

	/**
	 * 부대품목 내역 삭제
	 * 
	 * @param unitProcurementItemListVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteUnitProcurementItemList(UnitProcurementItemListVO unitProcurementItemListVO) throws Exception {
		return unitProcurementItemListMapper.deleteUnitProcurementItemList(unitProcurementItemListVO);
	}

}
