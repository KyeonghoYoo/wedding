package com.wedding.dsu.model.itemclassifications;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.ItemClassificationsMapper;

/**
 * 부대품목분류 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.06 v0.1
 */
@Service
public class ItemClassificationsServiceImpl implements ItemClassificationsService {
	@Autowired
	ItemClassificationsMapper itemClassificationsMapper;

	/**
	 * 부대품목분류 삽입
	 * 
	 * @param ItemClassificationsVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertItemClassification(ItemClassificationsVO ItemClassificationsVO) throws Exception {
		return itemClassificationsMapper.insertItemClassification(ItemClassificationsVO);
	}

	/**
	 * 부대품목분류 리스트 조회
	 * 
	 * @param ItemClassificationsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<ItemClassificationsVO> selectItemClassifications(ItemClassificationsVO ItemClassificationsVO)
			throws Exception {
		return itemClassificationsMapper.selectItemClassifications(ItemClassificationsVO);
	}

	/**
	 * 부대품목분류 상세 조회
	 * 
	 * @param ItemClassificationsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public ItemClassificationsVO selectItemClassification(ItemClassificationsVO ItemClassificationsVO)
			throws Exception {
		return itemClassificationsMapper.selectItemClassification(ItemClassificationsVO);
	}

	/**
	 * 부대품목분류 수정
	 * 
	 * @param ItemClassificationsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateItemClassification(ItemClassificationsVO ItemClassificationsVO) throws Exception {
		return itemClassificationsMapper.updateItemClassification(ItemClassificationsVO);
	}

	/**
	 * 부대품목분류 삭제
	 * 
	 * @param ItemClassificationsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteItemClassification(ItemClassificationsVO ItemClassificationsVO) throws Exception {
		return itemClassificationsMapper.deleteItemClassification(ItemClassificationsVO);
	}

}
