package com.neu.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class part2Servlet
 */
public class Part2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Part2Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title> Assignment 1 part 2 </title></head>");
		out.println("<body>");
		
		out.print("<h1>Using Request Headers</h1>");
		Enumeration<String> headerNames = request.getHeaderNames();
		out.print("<table border=1><th>Header</th><th>Header Detail</th>");
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			
			Enumeration<String> values = request.getHeaders(headerName); 
			
			if (values != null) {
		        while (values.hasMoreElements()) {
		          String value = (String) values.nextElement();
		          out.println("<tr><td>" + headerName +"</td>");
		          out.println("<td>" + value + "</td></tr>");
		        }
		      }
		}
		out.print("</table>");
		out.print("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
