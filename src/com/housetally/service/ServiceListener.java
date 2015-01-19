package com.housetally.service;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.googlecode.objectify.ObjectifyService;
import com.housetally.Category;
import com.housetally.House;
import com.housetally.HouseUser;
import com.housetally.Points;
import com.housetally.Setting;

public class ServiceListener implements ServletContextListener {
	
	static {
		// Register the entities
		ObjectifyService.register(House.class);		
		ObjectifyService.register(Points.class);
		ObjectifyService.register(HouseUser.class);
		ObjectifyService.register(Category.class);
		ObjectifyService.register(Setting.class);
	}
	public void contextInitialized(ServletContextEvent event) {

	}
	
	public void contextDestroyed(ServletContextEvent event) {}
}
