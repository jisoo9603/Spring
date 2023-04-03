package com.greedy.section01.aop.annotation.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.greedy.section01.aop.annotation.model.dao.OrderMapper;
import com.greedy.section01.aop.annotation.model.dto.OrderDTO;
import com.greedy.section01.aop.annotation.model.dto.OrderMenuDTO;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	
	private final OrderMapper orderMapper;
	
	@Autowired
	public OrderServiceImpl(OrderMapper orderMapper) {
		this.orderMapper = orderMapper;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT,
			rollbackFor = {RuntimeException.class})
	public void registOrder(OrderDTO order) {

		orderMapper.insertOrder(order);
		
		List<OrderMenuDTO> orderMenuList = order.getMenuList();
		for(OrderMenuDTO orderMenu : orderMenuList) {
			orderMapper.insertOrderMenu(orderMenu);
		}
		
	}

}
