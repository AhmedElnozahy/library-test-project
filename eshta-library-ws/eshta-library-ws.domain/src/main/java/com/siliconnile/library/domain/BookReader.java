package com.siliconnile.library.domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.pearlox.framework.domain.BasicObject;

@SuppressWarnings("serial")
@Entity
@Table(name = "book")
public class BookReader extends BasicObject {
	
	private Collection<Book> book;
	private Collection<Reader> reader;
	private Date lendDate;
	
	@Column(name="lend_date")
	public Date getLendDate() {
		return lendDate;
	}

	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}

	@Column(name="book_id")
	public Collection<Book> getBook() {
		return book;
	}

	public void setBook(Collection<Book> book) {
		this.book = book;
	}

	@Column(name="reader_Id")
	public Collection<Reader> getReader() {
		return reader;
	}

	public void setReader(Collection<Reader> reader) {
		this.reader = reader;
	}

}
