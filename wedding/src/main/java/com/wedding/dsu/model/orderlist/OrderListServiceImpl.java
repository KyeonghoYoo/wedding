package com.wedding.dsu.model.orderlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.OrderListMapper;

/**
 * 행사 내역 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1
 */
@Service
public class OrderListServiceImpl implements OrderListService {
	@Autowired
	OrderListMapper orderListMapper;

	/**
	 * 행사 내역 삽입
	 * 
	 * @param orderListVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertOrderList(OrderListVO orderListVO) throws Exception {
		return orderListMapper.insertOrderList(orderListVO);
	}

	/**
	 * 행사 내역 리스트 조회
	 * 
	 * @param orderListVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<OrderListVO> selectOrderList(OrderListVO orderListVO)
			throws Exception {
		return orderListMapper.selectOrderList(orderListVO);
	}

	/**
	 * 행사 내역 수정
	 * 
	 * @param orderListVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateOrderList(OrderListVO orderListVO) throws Exception {
		return orderListMapper.updateOrderList(orderListVO);
	}

	/**
	 * 행사 내역 삭제
	 * 
	 * @param orderListVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteOrderList(OrderListVO orderListVO) throws Exception {
		return orderListMapper.deleteOrderList(orderListVO);
	}

}
