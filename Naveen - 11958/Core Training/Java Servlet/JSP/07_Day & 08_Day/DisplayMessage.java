package com.bean;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class DisplayMessage extends SimpleTagSupport {
    public void doTag() throws IOException {
        JspWriter out = getJspContext().getOut();
        out.println("This is my custom tag");
    }

}