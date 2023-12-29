package com.practice;

public class Author {
	private String authorName,bookName;
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String authorName, String bookName) {
		super();
		this.authorName = authorName;
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", bookName=" + bookName + "]";
	}
	
	
}
