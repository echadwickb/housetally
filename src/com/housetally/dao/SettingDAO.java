package com.housetally.dao;

import java.util.List;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;
import com.housetally.Setting;

public class SettingDAO {
	
	public List<Setting> getSettings()
	{
		Objectify ofy = ObjectifyService.begin();
		Query<Setting> settings = null;
		
		try {
			settings = ofy.query(Setting.class);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return settings.list();
	}
	
	public Setting getSetting(String name) {
		Objectify ofy = ObjectifyService.begin();
		Setting setting = null;
		
		try {
			setting = ofy.get(Setting.class, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return setting;
	}
	
	public Setting save(Setting setting) {
		Objectify ofy = ObjectifyService.begin();
		try {
			ofy.put(setting);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return setting;
	}
	
	public Setting delete(Setting setting) {
		Objectify ofy = ObjectifyService.begin();
		try {
			ofy.delete(setting);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return setting;
	}
}
