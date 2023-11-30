package com.spring;
import java.util.List;
public class Book {
private int id;
private String name;
private List<Author> author;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(int id, String name, List<Author> author) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
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
public List<Author> getAuthor() {
	return author;
}
public void setAuthor(List<Author> author) {
	this.author = author;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
}

}
