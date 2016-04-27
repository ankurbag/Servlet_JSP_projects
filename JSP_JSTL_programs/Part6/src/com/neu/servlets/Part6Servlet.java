package com.neu.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Part6Servlet
 */
public class Part6Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	private Map<String, String[]> questionMap;
	public Part6Servlet() {
		// TODO Auto-generated constructor stub
		questionMap= new HashMap<String, String[]>();
		questionMap.put("1", new String[]{"Which servlet contain servlet life-cycle methods?", "HttpServlet", "GenericServlet", "Service", "Servlet"});
		questionMap.put("2", new String[]{"Which tag of DD maps internal name of the servlet to public URL pattern?", "servlet", "servlet-mapping", "web-app", "serlvlet-mappings"});
		questionMap.put("3", new String[]{"Which life-cycle method make ready for the servlet for garbage collection?", "init", "service", "system.gc", "destroy"});
		questionMap.put("4", new String[]{"Which interface contains servlets life-cycle methods?", "HttpServlet", "GenericServlet", "Service", "Servlet"});
		questionMap.put("5", new String[]{"Which statement is not true about ServletContext?", "There is one ServletContext per one application", "Generally it is used to get web app parameters", "we can get server information through it", "There is one one ServletContext per one servlet"});
		questionMap.put("6", new String[]{"Which statement is not true about ServletConfig?", "there is one servlet config per one application", "We can access ServletContext through it", "provide deploy-time information to server", "There is one servlet config per one servlet"});
		questionMap.put("7", new String[]{"Which life-cycle method make ready for the servlet for garbage collection?", "init", "service", "system.gc", "destroy"});
		questionMap.put("8", new String[]{"Which http method is idempotent?", "get", "port", "trace", "option"});
		questionMap.put("9", new String[]{"Which method does not exist in HttpServlet Class?", "service", "init", "doGet", "doPost"});
		questionMap.put("10", new String[]{"which life cycle method is called once in servlet life?", "class loading", "init()", "service()", "destroy()"});

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// QuestionReader.readPropertyFile();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");

		out.println("<html>");
		out.println("<head><title> Assignment 2 part 6 </title></head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println("<script>");
		out.println("  function preventBack(){window.history.forward();}");
		out.println("  setTimeout(\"preventBack()\", 0);");
		out.println("  window.onunload=function(){null};");
		out.println("  </script>");

		out.println("<link rel=\"stylesheet\" href=\"bootstrap.min.css\">");
		out.println(
				"<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">");
		out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>");
		out.println("<script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>");
		out.println("<script src=\"http://code.jquery.com/ui/1.10.0/jquery-ui.js\"></script>");

		out.println("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">");
		out.println("<script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>");
		out.println("<script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>");
		out.println("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">");
		out.println("<body>");
		out.println("<div class=\"container\" style=\"border: 2px solid #73AD21;\">");
		out.println("<div class=\"row\" style=\"padding-top:20px\">");
		out.println("<img src=\"images/logo.png\" alt=\"Java T point\" />");
		out.println("<form action=\"javatpointquiz.do\" method=\"post\">");
		out.println("<table class=table style=\"width:100%\">");
		out.println("<tr>");
		out.println("<th>General Information</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>");

		out.println("<table>");
		String key = "1";
		String value[] = questionMap.get(key);
		out.println("<tr><td>Q" + key + "</td><td>" + value[0] + "</td></tr>");
		out.println("<tr><td><input type=\"radio\" required name=\"options\"/> </td><td>" + value[1] + "  </td></tr>");
		out.println("<tr><td><input type=\"radio\" required name=\"options\"/> </td><td>" + value[2] + "</td></tr>");
		out.println("<tr><td><input type=\"radio\" required name=\"options\"/> </td><td>" + value[3] + "</td></tr>");
		out.println("<tr><td><input type=\"radio\"  required name=\"options\"/> </td><td>" + value[4] + "</td></tr>");
		out.println("<tr><td><input type=\"submit\" value=\"Next\"></td></tr>");

		out.println("<tr><td><input type=\"hidden\" name=\"questionNo\" value=" + key + "></td></tr>");

		out.println("</table>");
		out.println("</td>");
		out.println("</tr>");

		out.println("</table>");
		out.println("</form>");
		out.println("</div>");
		out.println("</div>");
		
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");

		out.println("<html>");
		out.println("<head><title> Assignment 2 part 6 </title></head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println("<script>");
		out.println("  function preventBack(){window.history.forward();}");
		out.println("  setTimeout(\"preventBack()\", 0);");
		out.println("  window.onunload=function(){null};");
		out.println("  </script>");
		out.println("<link rel=\"stylesheet\" href=\"bootstrap.min.css\">");
		out.println(
				"<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">");
		out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>");
		out.println("<script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>");
		out.println("<script src=\"http://code.jquery.com/ui/1.10.0/jquery-ui.js\"></script>");

		out.println("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">");
		out.println("<script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>");
		out.println("<script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>");
		out.println("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">");
		out.println("<body>");
		out.println("<div class=\"container\" style=\"border: 2px solid #73AD21;\">");
		out.println("<div class=\"row\" style=\"padding-top:20px\">");
		out.println("<img src=\"images/logo.png\" alt=\"Java T point\" />");
		out.println("<form action=\"javatpointquiz.do\" method=\"post\">");
		out.println("<table class=table style=\"width:100%\" border=1>");
		out.println("<tr>");
		out.println("<th>Questions</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>");

		out.println("<table class=table>");
		String keyStr = request.getParameter("questionNo");
		int key = Integer.parseInt(keyStr);
		key++;
		if (key < 11) {
			String value[] = questionMap.get(String.valueOf(key));
			out.println("<tr><td>Q" + key + "</td><td>" + value[0] + "</td></tr>");
			out.println("<tr><td><input type=\"radio\" required name=\"options\"/> </td><td>" + value[1] + "  </td></tr>");
			out.println("<tr><td><input type=\"radio\" required name=\"options\"/> </td><td>" + value[2] + "</td></tr>");
			out.println("<tr><td><input type=\"radio\" required name=\"options\"/> </td><td>" + value[3] + "</td></tr>");
			out.println("<tr><td><input type=\"radio\" required name=\"options\"/> </td><td>" + value[4] + "</td></tr>");
			out.println("<tr><td><input class=\"btn btn-success btn-sm\" type=\"submit\" value=\"Next\"></td></tr>");
			out.println("<tr><td><input type=\"hidden\" name=\"questionNo\" value=" + key + "></td></tr>");
		}else{
			out.println("<tr><td><h1> You have Submitted Successfully!!! </h1></td><td><h2>Thanks for giving the test</h2></td></tr>");
		}
		out.println("</table>");
		out.println("</td>");
		out.println("</tr>");

		out.println("</table>");
		out.println("</form>");
		out.println("</div>");
		out.println("</div>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
