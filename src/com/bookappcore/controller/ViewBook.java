package com.bookappcore.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookappcore.book.Book;
import com.bookappcore.bookdao.BookDAO;

@WebServlet("/ViewBook")
public class ViewBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if(request.getParameter("by name")==null) {
			PrintWriter out=response.getWriter();
			BookDAO bookdao=new BookDAO();
			List<Book> bookview = new ArrayList<>();
			try {
				bookview=bookdao.FindAll();
				if(bookview.size()>0){
					out.print("<table><th>ID</th><th>Name</th><th>Price</th>");
					for(Book book:bookview)
						out.print("<tr><td>"+book.getBookid()+"</td><td>"+book.getName()+"</td><td>"+book.getPrice()+"</td>");
					out.print("</table>");
				}
				else
					out.print("<h2>No Books Available</h2>");
			} catch (Exception e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
