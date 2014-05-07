package com.siliconnile.library.ws.service.impl;

import java.util.Collection;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;



import com.siliconnile.library.domain.Book;
import com.siliconnile.library.service.api.BookManagerApi;
import com.siliconnile.library.ws.service.api.BookManagerWebService;

public class BookManagerWebServiceImp implements BookManagerWebService {
	
	@Autowired
	private BookManagerApi bookManager;

	@Override
	public Collection<Book> getBooksInfo() throws Exception {
		
		return bookManager.getAllBooksInfo();
	}

	@Override
	public Book getBookInfo(int id) throws Exception {
		
		return bookManager.getBookInfo(id);
	}

}
