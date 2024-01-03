package com.jsp.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class WelcomeTag extends SimpleTagSupport {
	
	public void doTag() throws IOException {
		
		JspWriter out=getJspContext().getOut();
		out.println("Welcome tag of taglib");
	}
	

}
