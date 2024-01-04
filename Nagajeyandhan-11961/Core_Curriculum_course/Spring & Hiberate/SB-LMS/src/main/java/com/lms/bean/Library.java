package com.lms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_library")
public class Library {
	@Id
	@Column(name="l_id")
	private int id;
	@Column(name="l_name")
	private String name;
	@Column(name="l_bookName")
	private String bookName;
	@Column(name="l_date")
	private String date;

	public Library() {
		super();
	}

	public Library(int id, String name, String bookName, String date) {
		super();
		this.id = id;
		this.name = name;
		this.bookName = bookName;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
