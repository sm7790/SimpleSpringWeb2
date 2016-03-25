package com.simple.rest.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.simple.rest.config.AppContext;
import com.simple.rest.config.WebContext;

@Order(1)
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[]{AppContext.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{WebContext.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

	@Override
	public void onStartup(ServletContext servletcontext) throws ServletException{
		super.onStartup(servletcontext);
	}

	
}
