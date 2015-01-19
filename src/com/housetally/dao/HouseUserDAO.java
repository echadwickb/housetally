package com.housetally.dao;

import java.util.List;

import com.googlecode.objectify.NotFoundException;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;
import com.housetally.HouseUser;

public class HouseUserDAO {
	
	public List<HouseUser> getHouseUsers()
	{
		Objectify ofy = ObjectifyService.begin();
		Query<HouseUser> houseUsers = null;
		
		try {
			houseUsers = ofy.query(HouseUser.class);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return houseUsers.list();
	}
	
	public HouseUser getHouseUser(String email) {
		Objectify ofy = ObjectifyService.begin();
		HouseUser houseUser = null;
		
		try {
			houseUser = ofy.get(HouseUser.class, email);
		} catch (NotFoundException nfe) {
			houseUser = new HouseUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return houseUser;
	}
	
	public HouseUser save(HouseUser houseUser) {
		Objectify ofy = ObjectifyService.begin();
		try {
			ofy.put(houseUser);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return houseUser;
	}
	
	public HouseUser delete(HouseUser houseUser) {
		Objectify ofy = ObjectifyService.begin();
		try {
			ofy.delete(houseUser);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return houseUser;
	}
}
