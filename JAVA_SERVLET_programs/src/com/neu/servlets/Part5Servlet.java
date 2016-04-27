package com.neu.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Part5Servlet
 */
public class Part5Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Part5Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Enumeration enumeration=request.getParameterNames();
		 
		out.println("<html>");
		out.println("<head><title> Assignment 1 part 5 </title></head>");
		out.println("<body>");
		out.println("<img src=\"images/logo.PNG\" alt=\"Pet health Insurance\" />");

		out.println("<table style=\"width:100%\" border=1>");
		out.println("<tr>");
		out.println(
				"<th><img src=\"images/success.gif\" alt=\"Pet health Insurance\" />You have successfully Submitted the following data</th>");
		out.println("</tr>");

		while (enumeration.hasMoreElements()) {

			out.println("<tr>");
			String param=(String)enumeration.nextElement();
			
			out.println("<td>" + param + "</td>");
			out.println("<td>");
			String[] value =  request.getParameterValues(param);
			if (value.length > 1) {
				for (int i = 0; i < value.length; i++) {
					out.println("<li>" + value[i].toString() + "</li><br>");
				}
			} else
				out.println("" + value[0].toString() + "<br>");
			out.println("</td>");
			out.println("</tr>");
		}

		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
