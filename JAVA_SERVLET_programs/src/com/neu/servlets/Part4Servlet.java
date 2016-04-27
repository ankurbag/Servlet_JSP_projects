package com.neu.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Part4Servlet
 */
public class Part4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Part4Servlet() {
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

		Map m = request.getParameterMap();
		Set s = m.entrySet();
		Iterator it = s.iterator();

		out.println("<html>");
		out.println("<head><title> Assignment 1 part 4 </title></head>");
		out.println("<body>");
		out.println("<img src=\"images/logo.PNG\" alt=\"Pet health Insurance\" />");

		out.println("<table style=\"width:100%\" border=1>");
		out.println("<tr>");
		out.println(
				"<th><img src=\"images/success.gif\" alt=\"Pet health Insurance\" />You have successfully Submitted the following data</th>");
		out.println("</tr>");

		while (it.hasNext()) {

			out.println("<tr>");
			Map.Entry<String, String[]> entry = (Map.Entry<String, String[]>) it.next();

			String key = entry.getKey();
			String[] value = entry.getValue();
			out.println("<td>" + key + "</td>");
			out.println("<td>");
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
