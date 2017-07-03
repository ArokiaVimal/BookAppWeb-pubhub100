package com.bookappcore.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookappcore.dao.UserDAO;
import com.bookappcore.user.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		user.setEmail(request.getParameter("email"));
		user.setPsw(request.getParameter("psw"));
		UserDAO userdao=new UserDAO();
		final PrintWriter out=response.getWriter();
		try {
		   if(userdao.login(user))
			//System.out.println("Access Granted");   
			response.sendRedirect("menu.jsp");
		   else
			    out.println("Please check ur details provided");
		}
		   catch (Exception e) {
			   e.printStackTrace();
		   }
		
		}
	
	
	
}
