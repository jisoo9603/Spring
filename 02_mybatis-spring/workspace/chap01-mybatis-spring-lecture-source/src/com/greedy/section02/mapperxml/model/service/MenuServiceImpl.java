package com.greedy.section02.mapperxml.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greedy.section02.mapperxml.model.dao.MenuDAO;
import com.greedy.section02.mapperxml.model.dto.MenuDTO;

@Service("menuService")
public class MenuServiceImpl implements MenuService {
	
	private final MenuDAO menuDAO;
	
	@Autowired
	public MenuServiceImpl (MenuDAO menuDAO) {
		this.menuDAO = menuDAO;
	}

	@Override
	public List<MenuDTO> findAllmenus() {
		
		return menuDAO.selectMenuList();
	}
	

}
