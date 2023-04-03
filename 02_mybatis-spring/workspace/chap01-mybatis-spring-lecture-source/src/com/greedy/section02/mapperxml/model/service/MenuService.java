package com.greedy.section02.mapperxml.model.service;

import java.util.List;

import com.greedy.section02.mapperxml.model.dto.MenuDTO;

public interface MenuService {
	
	List<MenuDTO> findAllmenus();
}
