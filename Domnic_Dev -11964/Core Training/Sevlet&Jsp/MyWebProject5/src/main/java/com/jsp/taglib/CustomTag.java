package com.jsp.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomTag extends SimpleTagSupport {
	public void dotag() throws IOException{
	JspWriter out=getJspContext().getOut();
	out.println("Welcome to custom tag page");
}
}
