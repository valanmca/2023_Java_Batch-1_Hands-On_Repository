package com.bean;


import javax.servlet.jsp.JspException;  
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;  
import java.io.IOException;
import java.util.Calendar;
public class DisplayMessage extends TagSupport {
	
	public int  doStartTag() throws JspException
	{
//		super.doStartTag();
		JspWriter out=pageContext.getOut();
		try {
		out.print(Calendar.getInstance().getTime());
	}
		catch(Exception e) {
			System.out.println(e);
		}
		return SKIP_BODY;

	}
}
