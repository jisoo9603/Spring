package com.greedy.section01.mapperscan.model.service;

import java.util.List;

import com.greedy.section01.mapperscan.model.dto.MenuDTO;

public interface MenuService {
	
	List<MenuDTO> findAllMenus();

}
