package com.sachin.model;

import java.sql.Connection;

public class CheckConnection {

	public static void main(String[] args) {

		Connection conn = DBConnection.getConnection();
		
		if(conn == null)
			System.err.println("Connection could not be created");
		else{
			System.out.println("Connection created succesully");
			DBConnection.connectionClose(conn);
		}
	}

}
