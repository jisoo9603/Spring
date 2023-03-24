package com.greedy.section03.collection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pikachu implements Pokemon {

	@Override
	public void attack() {

		System.out.println("피카츄가 공격을 합니다.");
	}

}
