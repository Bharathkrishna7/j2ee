 package com.app.dao;

import com.app.model.App;

public interface AppDao { //4

	public int insertApp(App a)throws Exception;
	
	public boolean loginuser(String username,String password)throws Exception;
	
}
