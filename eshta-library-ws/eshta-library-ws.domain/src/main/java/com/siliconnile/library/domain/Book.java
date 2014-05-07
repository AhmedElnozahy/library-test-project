package com.siliconnile.library.domain;

import java.awt.Image;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.pearlox.framework.domain.BasicObject;

@SuppressWarnings("serial")
@Entity
@Table(name="book")
public class Book extends BasicObject {
	
	private String name;
	private String author;
	private String ISBN;
	private String status;
	private String coverImageUrl;
	
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="author")
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Column(name="isbn")
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	@Column(name="status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name="cover_image_url")
	public String getCoverImageUrl() {
		return coverImageUrl;
	}
	public void setCoverImageUrl(String coverImageUrl) {
		this.coverImageUrl = coverImageUrl;
	}
	
	
	
	
	
}
