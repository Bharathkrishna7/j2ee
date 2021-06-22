package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.app.model.App;

public class AppDaoImpl implements AppDao {         //5 data access object
	private static final String APP_INSERT = "insert into App_details values(?,?,?,?,?)";
	String url = "jdbc:mysql://localhost:3306/tsiicc";
	String username = "root";
	String password = "root";
	int i= 0;
	Connection con = null;
	PreparedStatement ps = null;

	@Override
	public int insertApp(App a) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password);
		ps = con.prepareStatement(APP_INSERT);
		ps.setString(1, a.getApplicationID());
		ps.setString(2, a.getNameofentrepreneur());
		ps.setString(3, a.getipname());
		ps.setString(4, a.getZone());
		ps.setString(5, a.getStatusofallotment());
		 i= ps.executeUpdate();
		 if (i != 0) {
				System.out.println("i::{DAO}" + i);
				return i;
			} else {
				System.out.println("i::{DAO}" + i);
				return i;
			}
	}
		
	@Override
	public boolean loginuser(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
