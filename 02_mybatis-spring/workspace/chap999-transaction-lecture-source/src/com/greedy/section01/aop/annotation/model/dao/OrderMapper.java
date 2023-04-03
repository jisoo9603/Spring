package com.greedy.section01.aop.annotation.model.dao;

import org.apache.ibatis.annotations.Mapper;

import com.greedy.section01.aop.annotation.model.dto.OrderDTO;
import com.greedy.section01.aop.annotation.model.dto.OrderMenuDTO;

@Mapper
public interface OrderMapper {
	
	int insertOrder(OrderDTO order);
	
	int insertOrderMenu(OrderMenuDTO orderMenu);

}
