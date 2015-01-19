package com.housetally.dao;


import java.util.List;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;
import com.housetally.Category;

public class CategoryDAO {

	public List<Category> getCategories()
	{
		Objectify ofy = ObjectifyService.begin();
		Query<Category> categories = null;
		
		try {
			categories = ofy.query(Category.class);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return categories.list();
	}
	
	public Category getCategory(Long id) {
		Objectify ofy = ObjectifyService.begin();
		Category category = null;
		
		try {
			category = ofy.get(Category.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return category;
	}
	
	public Category save(Category category) {
		Objectify ofy = ObjectifyService.begin();
		try {
			ofy.put(category);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return category;
	}
	
	public Category delete(Category category) {
		Objectify ofy = ObjectifyService.begin();
		try {
			ofy.delete(category);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return category;
	}
}
