package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AppDaoImple implements AppDao {
	private static final String App_INSERT = "insert into App_details values(?,?,?,?,?)";
	String url = "jdbc:mysql://localhost:3306/tsiicc";
	String username = "root";
	String password = "root";
	int i= 0;
	Connection con = null;
	PreparedStatement ps = null;

	@Override
	public int insertApp(App a) throws Exception  {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password);
		ps = con.prepareStatement(App_INSERT);
		ps.setLong(1, a.getAppid());
		ps.setString(2, a.getEntre());
		ps.setString(3, a.getIp());
		ps.setString(4, a.getZon());
		ps.setString(5, a.getStatus());
		 i= ps.executeUpdate();
		
		return i;
	}

	@Override
	public boolean loginUser(String username, String password) {
		
		return false;
	}

}
