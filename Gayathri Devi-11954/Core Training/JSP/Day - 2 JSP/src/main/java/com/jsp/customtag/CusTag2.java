package com.jsp.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CusTag2 extends SimpleTagSupport{ //or tag support
	public void doTag() throws IOException {//or doStartTag()
		JspWriter referenceName = getJspContext().getOut();
		referenceName.println("Second Custom tag java file");
	}
	
}
