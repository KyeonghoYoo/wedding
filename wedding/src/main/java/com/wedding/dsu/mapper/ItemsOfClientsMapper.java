package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.itemsofclients.ItemsOfClientsVO;

/**
 * 거래처 아이템 Mapper
 * 
 * @author 유경호
 * @version 2019.08.07 v0.1
 */
public interface ItemsOfClientsMapper {
	/**
	 * 거래처 아이템 등록
	 * 
	 * @param ItemsOfClientsVO
	 * @return
	 * @throws Exception
	 */
	public int insertItemsOfClient(ItemsOfClientsVO itemsOfClientsVO) throws Exception;

	/**
	 * 거래처 아이템 리스트 조회
	 * 
	 * @param ItemsOfClientsVO
	 * @return
	 * @throws Exception
	 */
	public List<ItemsOfClientsVO> selectItemsOfClients(ItemsOfClientsVO itemsOfClientsVO) throws Exception;

	/**
	 * 거래처 아이템 상세 조회
	 * 
	 * @param ItemsOfClientsVO
	 * @return
	 * @throws Exception
	 */
	public ItemsOfClientsVO selectItemsOfClient(ItemsOfClientsVO itemsOfClientsVO) throws Exception;

	/**
	 * 거래처 아이템 수정
	 * 
	 * @param ItemsOfClientsVO
	 * @return
	 * @throws Exception
	 */
	public int updateItemsOfClient(ItemsOfClientsVO itemsOfClientsVO) throws Exception;

	/**
	 * 거래처 아이템 삭제
	 * 
	 * @param ItemsOfClientsVO
	 * @return
	 * @throws Exception
	 */
	public int deleteItemsOfClient(ItemsOfClientsVO itemsOfClientsVO) throws Exception;
}
