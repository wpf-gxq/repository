package com.cssl.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyListener implements HttpSessionListener, ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("contextInitialized:====================");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session=se.getSession();
		session.setMaxInactiveInterval(10);
		System.out.println("sessionCreated:"+session.getId());

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session=se.getSession();
		System.out.println("sessionDestroyed:"+session.getId());

	}

}
