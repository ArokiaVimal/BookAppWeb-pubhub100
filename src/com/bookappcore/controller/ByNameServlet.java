package com.bookappcore.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookappcore.bookdao.BookDAO;

@WebServlet("/ByNameServlet")
public class ByNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		   
			PrintWriter out=response.getWriter();
			BookDAO bookdao=new BookDAO();
			try {
				ResultSet rs=bookdao.ByName(request.getParameter("byname"));
				if(rs.next()){
					out.print("<table><th>ID</th><th>Name</th><th>Price</th>");
					rs.beforeFirst();
					while(rs.next())
						out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getDouble(3)+"</td>");
					out.print("</table>");
				}
				else
					out.print("<h2>No Books Available in that name</h2>");
			} catch (Exception e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
}
