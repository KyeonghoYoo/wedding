package com.wedding.dsu.model.orderlist;

import java.util.List;

/**
 * 발주내역 Service Interface
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1
 */
public interface OrderListService {
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
