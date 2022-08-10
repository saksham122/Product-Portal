package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductSev
 */
@WebServlet("/ProductSev")
public class ProductSev extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Id = Integer.parseInt(request.getParameter("Id"));
		String Name = request.getParameter("Name");
		String Quantity = request.getParameter("Quantity");
		String Price = request.getParameter("Price");
		
		PrintWriter out = response.getWriter();
		HttpSession s = request.getSession();
		s.setAttribute("Id", Id);
		s.setAttribute("Name", Name);
		s.setAttribute("Quantity", Quantity);
		s.setAttribute("Price", Price);
		
		out.print("<a href='front.jsp'>Click Here To view the Record</a>");
		
	}

	
	

}
