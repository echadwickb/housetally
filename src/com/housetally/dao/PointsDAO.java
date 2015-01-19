package com.housetally.dao;

import java.util.Date;
import java.util.List;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;
import com.housetally.Points;

public class PointsDAO {
	
	public List<Points> getAllPoints()
	{
		Objectify ofy = ObjectifyService.begin();
		Query<Points> allPoints = null;
		
		try {
			allPoints = ofy.query(Points.class);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allPoints.list();
	}
	
	public List<Points> getPointsSince(Date timeSince)
	{
		Objectify ofy = ObjectifyService.begin();
		Query<Points> pointsSince = null;
		
		try {
			pointsSince = ofy.query(Points.class).filter("time >=", timeSince);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pointsSince.list();
	}
	
	public Points getPoints(Long id) {
		Objectify ofy = ObjectifyService.begin();
		Points points = null;
		
		try {
			points = ofy.get(Points.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return points;
	}
	
	public Points save(Points points) {
		Objectify ofy = ObjectifyService.begin();
		try {
			ofy.put(points);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return points;
	}
	
	public Points delete(Points points) {
		Objectify ofy = ObjectifyService.begin();
		try {
			ofy.delete(points);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return points;
	}
}
