package com.housetally.dao;

import java.util.List;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;
import com.housetally.House;

public class HouseDAO {
	
	public List<House> getHouses()
	{
		Objectify ofy = ObjectifyService.begin();
		Query<House> categories = null;
		
		try {
			categories = ofy.query(House.class);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return categories.list();
	}
	
	public House getHouse(String name) {
		Objectify ofy = ObjectifyService.begin();
		House house = null;
		
		try {
			house = ofy.get(House.class, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return house;
	}
	
	public House save(House house) {
		Objectify ofy = ObjectifyService.begin();
		try {
			ofy.put(house);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return house;
	}
	
	public House delete(House house) {
		Objectify ofy = ObjectifyService.begin();
		try {
			ofy.delete(house);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return house;
	}
}
