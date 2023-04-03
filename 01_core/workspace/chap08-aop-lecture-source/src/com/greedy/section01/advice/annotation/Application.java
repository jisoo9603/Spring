package com.greedy.section01.advice.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = 
				new AnnotationConfigApplicationContext("com.greedy.section01.advice.annotation");
		
		Student normalStudent = context.getBean("normalStudent", Student.class);
		Student greedyStudent = context.getBean("greedyStudent", Student.class);
		
		System.out.println("================normal=====================");
		AchievementResult normalResult = normalStudent.study(new Passion(10));
		System.out.println("normalStudent result : " + normalResult);
		
		System.out.println("================greedy====================");
		AchievementResult greedyResult = greedyStudent.study(new Passion(10));
		System.out.println("greedyStudent result : " + greedyResult);
		
	}

}
