package com.jsp.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class AddTag extends SimpleTagSupport{
	private String msg="jeban";
	public void doTag() throws IOException {
		JspWriter out = getJspContext().getOut();
		out.print(msg);
	}

}
