package com.myproject.application;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class WebApplicationContext implements WebApplicationInitializer {

	static Logger log = LogManager.getLogger( WebApplicationContext.class );
	public void onStartup(ServletContext servletContext) throws ServletException {

		log.debug(">>>> WebApplicationContext/onStartup....");
		servletContext.addListener(ContextLoaderListener.class);
		servletContext.setInitParameter(ContextLoader.CONTEXT_CLASS_PARAM, AnnotationConfigWebApplicationContext.class.getName());
	}

}
