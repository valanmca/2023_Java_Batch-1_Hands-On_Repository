package com.jsp.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CusTag3 extends SimpleTagSupport{
	
	public void doTag() throws IOException {
		JspWriter obj = getJspContext().getOut();
		obj.println("Third Custom tag java file");
	}

}
