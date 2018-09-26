package com.form.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;;

public class FormValidation extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		if(session.isNew()) {
			
			RequestDispatcher rd = req.getRequestDispatcher("/views/error.jsp");
			rd.forward(req, resp);
		}
		
		

		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		String purpose = req.getParameter("purpose");
		
		
		if(purpose.equals("login")) {
		boolean result = loginValidation(req);
		
		
		
		if(result)
		{
			RequestDispatcher rd = req.getRequestDispatcher("/views/welcome.jsp");
			rd.forward(req, resp);
		}else
		{
			pw.println("wrong credentials");
			RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
			rd.include(req, resp);
		}
		}else if(purpose.equals("logout")) {
			
			
			pw.println("you logged out");
			RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
			rd.include(req, resp);
		}else if (purpose.equals("feeling")) {
			
			if(session.isNew()) {
				RequestDispatcher rd = req.getRequestDispatcher("/views/error.jsp");
				rd.forward(req, resp);
			}
			else {
			RequestDispatcher rd = req.getRequestDispatcher("/views/nothing.jsp");
			rd.forward(req, resp);
			}
		}

	}
	
	
	
	
	public boolean loginValidation(HttpServletRequest req) {
		
		String name = req.getParameter("uname");
		String pwd = req.getParameter("upass");
		boolean result = false;

	
		if((name.equals("rakesh"))&&(pwd.equals("rakz")))
		{
			result = true;
		}else
		{
			
		}
		
		return result;
		
	}
	
	
	/*public void logout(HttpServletRequest req) {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("You are logged out");
		RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
		rd.include(req, resp);
	}*/

	@Override
	public void destroy() {

	}

}
