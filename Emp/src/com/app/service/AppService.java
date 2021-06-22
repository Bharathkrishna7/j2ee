package com.app.service;

import com.app.dao.AppDaoImpl;
import com.app.model.App;

public class AppService {       //3 service

	private AppDaoImpl dao = null;

	public int registerApp(App a) throws Exception {
		dao=new AppDaoImpl();
		int i = dao.insertApp(a);
		System.out.println("i::{SERVICE}" + i);
		return i;
	}
}
