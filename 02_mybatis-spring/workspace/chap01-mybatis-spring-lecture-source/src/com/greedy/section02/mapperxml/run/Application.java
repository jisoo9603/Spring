package com.greedy.section02.mapperxml.run;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.greedy.section02.mapperscan.config.ContextConfiguration;
import com.greedy.section02.mapperxml.model.dto.MenuDTO;
import com.greedy.section02.mapperxml.model.service.MenuService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = 
				new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
		for(String name: context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		MenuService menuService = context.getBean("menuService", MenuService.class);
		List<MenuDTO> menus = menuService.findAllmenus();
		for(MenuDTO menu : menus) {
			System.out.println(menu);
		}
	}

}
