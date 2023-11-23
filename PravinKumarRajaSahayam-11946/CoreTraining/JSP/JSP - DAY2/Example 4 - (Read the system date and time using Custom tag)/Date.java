package com.bean;
import java.io.IOException;
import java.util.Calendar;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.*;
public class Date extends TagSupport {  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int doStartTag() throws JspException {
		JspWriter j=pageContext.getOut();
		try{
		j.println(Calendar.getInstance().getTime());
		}catch(IOException e){System.out.println(e);}
		return SKIP_BODY;
		}
	} 
