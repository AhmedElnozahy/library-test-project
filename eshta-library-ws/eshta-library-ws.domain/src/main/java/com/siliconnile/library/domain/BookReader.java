package com.siliconnile.library.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.pearlox.framework.domain.BasicObject;

@SuppressWarnings("serial")
@Entity
@Table(name = "book")
public class BookReader extends BasicObject {
	
	private Book book;
	private Reader reader;
	private Date lendDate;
	
	@Column(name="lend_date")
	public Date getLendDate() {
		return lendDate;
	}
	
	@Column(name="book_id")
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	@Column(name="reader_Id")
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}

}
