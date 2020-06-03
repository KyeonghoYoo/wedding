package com.wedding.dsu.model.itemsofclients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.ItemsOfClientsMapper;

/**
 * 거래처 직원 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.07 v0.1
 */
@Service
public class ItemsOfClientsServiceImpl implements ItemsOfClientsService {
	@Autowired
	ItemsOfClientsMapper itemsOfClientsMapper;

	/**
	 * 거래처 직원 삽입
	 * 
	 * @param itemsOfClientsVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertItemsOfClient(ItemsOfClientsVO itemsOfClientsVO) throws Exception {
		return itemsOfClientsMapper.insertItemsOfClient(itemsOfClientsVO);
	}

	/**
	 * 거래처 직원 리스트 조회
	 * 
	 * @param itemsOfClientsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<ItemsOfClientsVO> selectItemsOfClients(ItemsOfClientsVO itemsOfClientsVO)
			throws Exception {
		return itemsOfClientsMapper.selectItemsOfClients(itemsOfClientsVO);
	}

	/**
	 * 거래처 직원 상세 조회
	 * 
	 * @param itemsOfClientsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public ItemsOfClientsVO selectItemsOfClient(ItemsOfClientsVO itemsOfClientsVO)
			throws Exception {
		return itemsOfClientsMapper.selectItemsOfClient(itemsOfClientsVO);
	}

	/**
	 * 거래처 직원 수정
	 * 
	 * @param itemsOfClientsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateItemsOfClient(ItemsOfClientsVO itemsOfClientsVO) throws Exception {
		return itemsOfClientsMapper.updateItemsOfClient(itemsOfClientsVO);
	}

	/**
	 * 거래처 직원 삭제
	 * 
	 * @param itemsOfClientsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteItemsOfClient(ItemsOfClientsVO itemsOfClientsVO) throws Exception {
		return itemsOfClientsMapper.deleteItemsOfClient(itemsOfClientsVO);
	}

}
