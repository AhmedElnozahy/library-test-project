package com.siliconnile.library.dao.impl;

import org.springframework.stereotype.Repository;

import com.pearlox.framework.dao.impl.BasicJpaDao;
import com.siliconnile.library.dao.BookDao;
import com.siliconnile.library.domain.Book;

@Repository
public class BookDaoImp extends BasicJpaDao<Book> implements BookDao {

	public BookDaoImp() {
		super(Book.class);
	}
}
