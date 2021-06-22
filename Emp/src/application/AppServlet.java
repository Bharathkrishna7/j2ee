package application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AppServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    App a=new App();
      int i=0;
      PrintWriter pw=response.getWriter();
       a.setAppid(Long.parseLong(request.getParameter("appid")));
       a.setEntre(request.getParameter("entre"));
       a.setIp(request.getParameter("ip"));
       a.setZon(request.getParameter("zon"));
       a.setStatus(request.getParameter("status"));
       
       AppService service = new AppService();
		try {
			i= service.registerApp(a);
			if (i != 0) {
			 pw.println("Successfully saved");
			} else {
				pw.println("Failed to save");

			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	  
	}
}
