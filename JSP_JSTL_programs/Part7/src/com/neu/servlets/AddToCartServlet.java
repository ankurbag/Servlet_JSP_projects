package com.neu.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neu.beans.InitShoppingCart;
import com.neu.beans.ShoppingItem;

/**
 * Servlet implementation class AddToCArt
 */
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public AddToCartServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// initiate the shopping cart
		String[] selectedProducts = request.getParameterValues("prodId");
		String action = "";

		HttpSession sessionObj = request.getSession();
		Set myCart;
		if (sessionObj.getAttribute("myCart") != null) {
			myCart = (HashSet) sessionObj.getAttribute("myCart");
		} else {
			myCart = new HashSet();
		}
		if (request.getAttribute("action") != null) {
			action = (String) request.getAttribute("action");
		}

		ArrayList listOfItems = (ArrayList) InitShoppingCart.getAvailableItems();
		if (action.equalsIgnoreCase("remove")) {
			for (Object o : listOfItems) {
				ShoppingItem item = (ShoppingItem) o;
				for (String id : selectedProducts) {
					if (item.getProductId().equalsIgnoreCase(id)) {
						myCart.remove(item);
					}
				}
			}
		} else {
			for (Object o : listOfItems) {
				ShoppingItem item = (ShoppingItem) o;
				for (String id : selectedProducts) {
					if (item.getProductId().equalsIgnoreCase(id)) {
						myCart.add(item);
					}
				}
			}
		}
		System.out.println(myCart);
		sessionObj.setAttribute("myCart", myCart);
		response.sendRedirect("viewCart.jsp");

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
