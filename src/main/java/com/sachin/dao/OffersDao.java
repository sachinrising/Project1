package com.sachin.dao;

import org.springframework.stereotype.Component;

@Component("offersDao")
public class OffersDao {

	public OffersDao() {
		System.out.println("Succesfully loaded offers DAO");
	}
}
