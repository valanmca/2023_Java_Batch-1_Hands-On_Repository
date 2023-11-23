package com.Example;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.jar.JarException;
public class DisplayMessage<JspWritter>   extends SimpleTagSupport {
	
	public void doTag() throws JspException,IOException{
		super.doTag();
		
		JspWriter out=((JspContext) getJspContext()). getOut();
		
		out.print("Hello Admin !");
	}
}