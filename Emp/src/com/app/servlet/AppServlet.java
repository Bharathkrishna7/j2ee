package com.app.servlet;//2 controller

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.App;
import com.app.service.AppService;

public class AppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		App a= new App();
		int i = 0;
		PrintWriter pw = response.getWriter();
		 a.setApplicationId(request.getParameter("ApplicationId"));
	       a.setZone(request.getParameter("Nameofentrepreneur"));
	       a.setipname(request.getParameter("ipname"));
	       a.setZone(request.getParameter("Zone"));
	       a.setStatusofAllotment(request.getParameter("Statusofallotment"));
	       
		try {
			AppService service = new AppService();
			i = service.registerApp(a);
			System.out.println("i::{SERVLET}"+i);
			if (i != 0) {
				pw.println("update Success");
			} else {
				pw.println("Failed");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
     