package com.form.controllers;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class LogOut extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("You are logged out");
		RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
		rd.include(req, resp);
		
	}
	
	@Override
	public void destroy() {
		
	}

}
