package com.bookappcore.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookappcore.book.Book;
import com.bookappcore.bookdao.BookDAO;


@WebServlet("/ChangeServlet")
public class ChangeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Book book = new Book();  
		book.setName(request.getParameter("name"));
		book.setPrice(Double.parseDouble(request.getParameter("price")));
		BookDAO bookdao=new BookDAO();
		final PrintWriter out=response.getWriter();
		try {
		   if(bookdao.updatePrice(book))
			   out.println("Book Price Updated Succesfully");
		   else
			    out.println("Please check ur details provided");
		}
		   catch (Exception e) {
			   e.printStackTrace();
		   }
		}
	
	
	
}