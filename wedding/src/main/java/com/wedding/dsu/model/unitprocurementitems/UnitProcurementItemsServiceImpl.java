package com.wedding.dsu.model.unitprocurementitems;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.UnitProcurementItemsMapper;

/**
 * 부대품목 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.06 v0.1
 */
@Service
public class UnitProcurementItemsServiceImpl implements UnitProcurementItemsService {
	@Autowired
	UnitProcurementItemsMapper unitProcurementItemsMapper;

	/**
	 * 부대품목 삽입
	 * 
	 * @param UnitProcurementItemsVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertUnitProcurementItem(UnitProcurementItemsVO UnitProcurementItemsVO) throws Exception {
		return unitProcurementItemsMapper.insertUnitProcurementItem(UnitProcurementItemsVO);
	}

	/**
	 * 부대품목 리스트 조회
	 * 
	 * @param UnitProcurementItemsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<UnitProcurementItemsItemClassificationsJoinVO> selectUnitProcurementItems(UnitProcurementItemsVO UnitProcurementItemsVO)
			throws Exception {
		return unitProcurementItemsMapper.selectUnitProcurementItems(UnitProcurementItemsVO);
	}

	/**
	 * 부대품목 상세 조회
	 * 
	 * @param UnitProcurementItemsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public UnitProcurementItemsItemClassificationsJoinVO selectUnitProcurementItem(UnitProcurementItemsVO UnitProcurementItemsVO)
			throws Exception {
		return unitProcurementItemsMapper.selectUnitProcurementItem(UnitProcurementItemsVO);
	}

	/**
	 * 부대품목 수정
	 * 
	 * @param UnitProcurementItemsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateUnitProcurementItem(UnitProcurementItemsVO UnitProcurementItemsVO) throws Exception {
		return unitProcurementItemsMapper.updateUnitProcurementItem(UnitProcurementItemsVO);
	}

	/**
	 * 부대품목 삭제
	 * 
	 * @param UnitProcurementItemsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteUnitProcurementItem(UnitProcurementItemsVO UnitProcurementItemsVO) throws Exception {
		return unitProcurementItemsMapper.deleteUnitProcurementItem(UnitProcurementItemsVO);
	}

}
