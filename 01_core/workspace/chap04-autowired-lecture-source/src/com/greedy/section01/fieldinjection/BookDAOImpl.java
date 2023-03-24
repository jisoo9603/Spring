package com.greedy.section01.fieldinjection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {

	private final Map<Integer, BookDTO> bookList;
	
	public BookDAOImpl() {
		
		this.bookList = new HashMap<>();
		
		this.bookList.put(1, new BookDTO(1, 123456, "자바의정석", "남궁성", "도우출판", new java.util.Date()));
		this.bookList.put(1, new BookDTO(2, 514123, "수학의정석", "김진호", "지노소프트", new java.util.Date()));
		this.bookList.put(1, new BookDTO(3, 512314, "칭찬은 고래도 춤추게 한다", "고래", "클러버", new java.util.Date()));
	}
	@Override
	public List<BookDTO> findAllBooks() {
		
		return new ArrayList<BookDTO>(bookList.values());
	}

	@Override
	public BookDTO findOneBookBySequence(int sequence) {
		
		return bookList.get(sequence);
	}

}
