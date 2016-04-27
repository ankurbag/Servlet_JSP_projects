package com.neu.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.beans.ShoppingItem;

/**
 * Servlet implementation class SearchItemsServlet
 */
public class SearchItemsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchItemsServlet() {
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
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		List<ShoppingItem> listofItems = getAvailableItems();
		List<ShoppingItem> selectedItems = new ArrayList<ShoppingItem>();

		String type = request.getParameter("type");
		//String courseTitle = request.getParameter("course");

		type = type.replaceAll("[^\\dA-Za-z]", "").replaceAll("\\s", "+").trim();
		//courseTitle = courseTitle.replaceAll("[^\\dA-Za-z]", "").replaceAll("\\s", "+").trim();

		/*if (courseTitle.equals("") && type.equals("")) {
			response.sendRedirect("error.jsp");
		}
		*///out.print("<h1>hello</h1> : " + type);
		request.setAttribute("listofItems", listofItems);
		RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
		/*for (ShoppingItem shoppingItem : listofItems) {
			if (course.getCourseInstructor().equalsIgnoreCase(instructorName)) {
				selectedItems.add(course);
			}
		}
		out.println("<body>");
		out.println("<form method='post' action='addCourse.htm'>");
		for (Course course : selectedItems) {
			String crn = course.getCrn();
			String courseName = course.getCourseName();
			out.println("<input type='checkbox' name='courseId'>" + crn + " " + courseName + "</input>");
			out.println("<a href='addCourse.htm?crn=" + crn + "&name=" + courseName
					+ "&action=single'>Add this course</a>");
		}
		out.println("<input type='hidden' name='action' value='multiple'>");
		out.println("<input type='submit' value='Add Selected Courses'>");
		out.println("</form>");
		out.print("</body>");
*/	}

	public static List<ShoppingItem> getAvailableItems() {

		ArrayList<ShoppingItem> shoppingItemsList = new ArrayList<ShoppingItem>();
		// Books
		ShoppingItem shoppingItem = new ShoppingItem();
		shoppingItem.setName("Java Servlet");
		shoppingItem.setType("Book");
		shoppingItem.setPrice("$29.95");

		ShoppingItem shoppingItem2 = new ShoppingItem();
		shoppingItem2.setName("Oracle DB Book");
		shoppingItem2.setType("Book");
		shoppingItem2.setPrice("$48.95");

		ShoppingItem shoppingItem3 = new ShoppingItem();
		shoppingItem3.setName("System Analyst and Design");
		shoppingItem3.setType("Book");
		shoppingItem3.setPrice("$14.95");

		// Music
		ShoppingItem shoppingItem4 = new ShoppingItem();
		shoppingItem4.setName("Coldplay - Lost");
		shoppingItem4.setType("Music");
		shoppingItem4.setPrice("$29.95");

		ShoppingItem shoppingItem5 = new ShoppingItem();
		shoppingItem5.setName("Imagine Dragon - Radioactive");
		shoppingItem5.setType("Music");
		shoppingItem5.setPrice("$48.95");

		ShoppingItem shoppingItem6 = new ShoppingItem();
		shoppingItem6.setName("Beatles - Come together");
		shoppingItem6.setType("Music");
		shoppingItem6.setPrice("$14.95");
		
		return null;
		
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
