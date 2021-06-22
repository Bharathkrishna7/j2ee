package application;

public class AppService {
	private AppDaoImple dao = null;
	public int registerApp(App a) throws Exception {
		dao=new AppDaoImple();
		int i= dao.insertApp(a);
		return i;
	}
}
