package com.jsp.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CusTagAttribute extends SimpleTagSupport {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void doTag() throws JspException, IOException {
		if (message != null) {
			JspWriter obj = getJspContext().getOut();
			obj.println(message);
		}
	}

}
