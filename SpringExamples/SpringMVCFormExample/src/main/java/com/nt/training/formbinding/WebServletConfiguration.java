package com.nt.training.formbinding;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext annotationConfigApplicationContext=new AnnotationConfigWebApplicationContext();
		annotationConfigApplicationContext.register(SpringConfig.class);
		annotationConfigApplicationContext.setServletContext(servletContext);
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(annotationConfigApplicationContext));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
	}

}
