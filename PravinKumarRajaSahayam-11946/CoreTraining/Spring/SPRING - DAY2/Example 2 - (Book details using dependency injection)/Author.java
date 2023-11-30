package com.spring;
public class Author {
private String name;
private String location;
public Author(String name, String location) {
	super();
	this.name = name;
	this.location = location;
}
public Author() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Author [name=" + name + ", location=" + location + "]";
}


}

