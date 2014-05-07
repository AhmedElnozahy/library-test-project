package com.siliconnile.library.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siliconnile.library.dao.BookDao;
import com.siliconnile.library.domain.Book;
import com.siliconnile.library.service.api.BookManagerApi;

@Service
public class BookManagerImp implements BookManagerApi {
	
	@Autowired
	private BookDao bookdoa;

	@Override
	public Collection<Book> getAllBooksInfo() throws Exception {
		
		return bookdoa.findAll();
		
	}

	@Override
	public Book getBookInfo(int id) throws Exception {
		
		return bookdoa.findById((long) id);
	}

}
