package com.neu.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ServletOne() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**
		 * Step 1 : Initially form is displayed in the doGet method, and
		 * initially form submission will be handled in JavaScript that creates
		 * the page as shown
		 **/
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html");
		out.println("<html");
		out.println("<head");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>Part3</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h1>Welcome to my page</h1>");
		out.println("<form action=\"servletOne?action=step2\" method=\"post\" id=\"form1\">");
		out.println("How many children do you have?<input type=\"text\" name=\"noofChildrenText\" />");
		out.println("<input type=\"submit\" onclick=\"submitForm()\" />");
		out.println("</form>");

		out.println("<script>");
		out.println(" 	function submitForm(){ ");
		
		out.println("		document.getElementById(\"form1\").submit(); ");
		out.println(" 	} ");
		out.println("</script>");
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
		String action = request.getParameter("action");

		/**
		 * Step 2 : Now,this form (2nd screenshot) is to be submitted via POST
		 * so that the same servlet could handle this request in the same
		 * servlet.
		 **/
		if (action.equalsIgnoreCase("step2")) {
			getChildren(request, response);
		}
		/**
		 * Step 3 : Now, this form (2nd screenshot) is to be submitted via POST
		 * so that the same servlet could handle this request in the same
		 * servlet.
		 **/
		if (action.equalsIgnoreCase("step3")) {
			showChildren(request, response);
		}
		
	}

	public void getChildren(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String noOfChildren = (String) request.getParameter("noofChildrenText");
		int num = Integer.parseInt(noOfChildren);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html");
		out.println("<html");
		out.println("<head");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>Part3 Step 2</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h1>Enter your Child/Children informations</h1>");
		out.println("<form action=\"servletOne?action=step3\" method=\"post\" id=\"form1\">");
		for (int i = 0; i < num; i++) {
			out.println("Please enter the Name of child " + i
					+ "<br/> :<input type=\"text\" name=\"noofChildrenText\" /><br><br>");
		}
		out.println("<input type=\"submit\" onclick=\"submitForm()\" />");
		out.println("</form>");

		out.println("<script>");
		out.println(" 	function submitForm(){ ");
		
		out.println("		document.getElementById(\"form1\").submit(); ");
		out.println(" 	} ");
		out.println("</script>");
		out.println("</body>");
		out.println("</html>");
	}

	public void showChildren(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String [] noOfChildren = (String[]) request.getParameterValues("noofChildrenText");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html");
		out.println("<html");
		out.println("<head");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>Part3 Step 3</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h1>Your Children Information:</h1>");
		out.println("<form action=\"servletOne\" method=\"get\" id=\"form1\">");
		for (int i = 0; i < noOfChildren.length; i++) {
			out.println("<h2>"+noOfChildren[i]+"</h2>");
		}
		out.println("<input type=\"submit\" onclick=\"submitForm()\" value=\"Go to home\" />");
		out.println("</form>");

		out.println("<script>");
		out.println(" 	function submitForm(){ ");
		
		out.println("		document.getElementById(\"form1\").submit(); ");
		out.println(" 	} ");
		out.println("</script>");
		out.println("</body>");
		out.println("</html>");
	}

}
