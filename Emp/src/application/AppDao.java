package application;

public interface AppDao {
	public int insertApp(App a) throws Exception;
	
	public boolean loginUser(String username,String password);

}
