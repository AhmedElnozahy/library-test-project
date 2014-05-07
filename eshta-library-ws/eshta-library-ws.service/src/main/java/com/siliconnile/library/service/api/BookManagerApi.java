package com.siliconnile.library.service.api;

import java.util.Collection;

import com.siliconnile.library.domain.Book;

public interface BookManagerApi {
	
	Collection<Book> getAllBooksInfo() throws Exception; 
	
	Book getBookInfo(int id) throws Exception;

}
