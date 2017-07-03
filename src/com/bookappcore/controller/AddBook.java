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

@WebServlet("/AddBook") 
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final PrintWriter print=response.getWriter();
		Book book = new Book();
		book.setName(request.getParameter("name"));
	    book.setPrice(Double.parseDouble(request.getParameter("price")));
		BookDAO bookdao = new BookDAO();
		try {
			bookdao.AddBook(book);
			print.println(request.getParameter("name")+" book is added");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
