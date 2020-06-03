package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.orderlist.OrderListVO;

/**
 * 발주내역 Mapper
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1
 */
public interface OrderListMapper {
	/**
	 * 발주내역 내역 등록
	 * 
	 * @param OrderListVO
	 * @return
	 * @throws Exception
	 */
	public int insertOrderList(OrderListVO orderListVO) throws Exception;

	/**
	 * 발주내역 내역 리스트 조회
	 * 
	 * @param OrderListVO
	 * @return
	 * @throws Exception
	 */
	public List<OrderListVO> selectOrderList(OrderListVO orderListVO) throws Exception;

	/**
	 * 발주내역 내역 수정
	 * 
	 * @param OrderListVO
	 * @return
	 * @throws Exception
	 */
	public int updateOrderList(OrderListVO orderListVO) throws Exception;

	/**
	 * 발주내역 내역 삭제
	 * 
	 * @param OrderListVO
	 * @return
	 * @throws Exception
	 */
	public int deleteOrderList(OrderListVO orderListVO) throws Exception;
}
