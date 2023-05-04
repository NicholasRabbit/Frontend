package com.javaee.ajax;

import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import java.io.IOException;

public class AjaxTest001 implements Servlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("AjaxTest001 init() method execute!");
	}
	
	public void service (ServletRequest request,ServletResponse response) throws ServletException,IOException {
		System.out.println("service execute!");
	}

	public ServletConfig getServletConfig(){
		return null;
	}

	public String getServletInfo(){
		return null;
	}

	public void destroy(){
		
	}
}