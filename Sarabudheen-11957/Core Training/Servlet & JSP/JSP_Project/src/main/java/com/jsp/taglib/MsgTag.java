package com.jsp.taglib;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MsgTag extends SimpleTagSupport {
	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	StringWriter sw = new StringWriter();

	public void doTag() throws JspException,IOException {

		if (msg != null) {
			JspWriter out = getJspContext().getOut();
			out.println(msg);
		} else {
			JspWriter out = getJspContext().getOut();
			out.println("Invalid Message");
		}
	}

}
