package com.jsp.taglib;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import java.io.*;

public class HelloTag extends SimpleTagSupport {

	public void doTag() throws IOException {
		JspWriter out = getJspContext().getOut();
		out.print("Hello Sara");
	}

}
