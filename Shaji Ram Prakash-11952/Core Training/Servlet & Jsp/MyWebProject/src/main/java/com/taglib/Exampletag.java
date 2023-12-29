package com.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Exampletag extends SimpleTagSupport{
	public void doGet() throws IOException {
		JspWriter out = getJspContext().getOut();
		out.println("Example taglib");
	}

}
