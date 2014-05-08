package com.siliconnile.library.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.pearlox.framework.domain.BasicObject;

@SuppressWarnings("serial")
@Entity
@Table(name="reader")
public class Reader extends BasicObject {
	
	private String name;
	private Date regDate;
	
	@Column(name="reader_name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="registration_date")
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
