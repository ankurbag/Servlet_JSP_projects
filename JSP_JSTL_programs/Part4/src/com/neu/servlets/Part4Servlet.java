package com.neu.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class part4Servlet
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");

		out.println("<html>");
		out.println("<head><title> Assignment 2 part 4 </title></head>");
		out.println("<body>");
		out.println("<img src=\"images/logo.PNG\" alt=\"Pet health Insurance\" />");
		out.println("<form action=\"part4Servlet\" method=\"post\">");
		  
		out.println("<table style=\"width:100%\" border=1>");
		out.println("<tr>");
		out.println("<tr>");
		out.println("<th>General Information</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>");
		out.println("<table>");
		out.println("<tr><td>Name</td><td><input type=\"text\" required name=\"username\" onblur=\"allowAlphabets(this)\" ></td></tr>");
		out.println("<tr><td>Address:</td><td><input type=\"text\" required name=\"address\"></td></tr>");
		out.println("<tr><td>City:</td><td><input type=\"text\" required name=\"city\" onblur=\"allowAlphabets(this)\" ></td></tr>");
		out.println("<tr><td>Phone:</td><td><input type=\"number\" required name=\"phone\" min=\"1000000000\" max=\"9999999999\"></td></tr>");
		out.println("<tr><td>Account Number:</td><td><input type=\"number\" required name=\"accountno\" min=\"1000000000\" max=\"9999999999\"></td></tr>");
		out.println("<tr><td>Pet Name:</td><td><input type=\"text\" required name=\"petname\" onblur=\"allowAlphabets(this)\" ></td></tr>");
		out.println("<tr><td>Age:</td><td><input type=\"number\" required name=\"age\" min=1 max=\"120\"></tr>");
		out.println("</table>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Diagnosis/Symptom Information</th>");
		out.println("<tr><td>Story <textarea  placeholder=\"Please describe this incident, including dates, details and symptoms leading up to it.\" required name=\"story\" style=\"resize:none\"></textarea></td></tr>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><table>");
		out.println("<tr><td>This claim is related to:</td><td>");
		
		out.println("<label><input type=\"checkbox\" name=\"claimCheckBox\" value=\"Accident\"> Accident</label>");
		out.println("<label><input type=\"checkbox\" name=\"claimCheckBox\" value=\"Illness\"> Illness</label><label><input type=\"checkbox\" name=\"claimCheckBox\" value=\"Accident\"> Wellness</label></td></tr>");
		out.println("<tr><td>Veterinarian:</td><td><input type=\"text\" required name=\"vetName\" onblur=\"allowAlphabets(this)\" ></td></tr>");
		out.println("<tr><td>Is this claim an estimate for future treatment:</td><td><label><input type=\"radio\" name=\"claimRadio\" value=\"Yes\"> Yes</label><label><input type=\"radio\" name=\"claimRadio\" value=\"No\"> No</label></td></tr>");
		out.println("<tr><td>Clinic name:</td><td><input type=\"text\" required name=\"clinicName\" onblur=\"allowAlphabets(this)\" ></td></tr>");
		out.println("<tr><td>Total Amount Claimed:</td><td><input type=\"number\" required name=\"totalAmt\"  min=\"0\" max=\"9999999999\"></td></tr>");
		out.println("<tr><td>Phone Number:</td><td><input type=\"number\" required name=\"phoneNum2\"  min=\"1000000000\" max=\"9999999999\" ></td></tr>");
		out.println("<tr><td>Send payment to:</td><td><label><input type=\"checkbox\" name=\"claimCheckBox2\" value=\"Me\" > Me</label><label><input type=\"checkbox\" name=\"claimCheckBox2\" value=\"Vet\"> Vet</label></td></tr>");
		
		out.println("<tr><td>Did any other vet check your pet?</td><td><label><input type=\"radio\" name=\"vetRadio\" value=\"Yes\">Yes</label><label><input type=\"radio\" name=\"vetRadio\" value=\"No\">No</label></td></tr>");
		out.println("<tr><td>Is this a new condition?</td><td><label><input type=\"radio\" name=\"vetRadio2\" value=\"Yes\">Yes</label><label><input type=\"radio\" name=\"vetRadio2\" value=\"No\">No</label></td></tr>");
		out.println("</table>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Pet Owner Declaration</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><table>");
		out.println("<tr><td>Signature:</td><td><input type=\"text\"  name=\"signature\" onblur=\"allowAlphabets(this)\" required></td></tr>");
		out.println("<tr><td>Date:</td><td><input type=\"date\"   name=\"signingDate\" required></td></tr>");
		out.println("<tr><td><button type=\"submit\">Submit</button></td></tr>");
		out.println("</table>");
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("<script>");
		/**Client Side Sanitization **/
		out.println("function allowAlphabets(inputfield) {");
		out.println("	  var regex = /^[a-zA-Z ]*$/;");
		out.println("	  var strVal = inputfield.value;");
		out.println("	  if( !regex.test(strVal)){");
		out.println("			alert(\"Error:Not a valid input for the field(Allowed - A-Z / a -z)\");");
		out.println("			inputfield.value = '';");
		out.println("		inputfield.focus();");
		out.println("	  }");
		out.println("	  }");
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
		
		String userName = request.getParameter("username");
		String city = request.getParameter("city");
		String petname = request.getParameter("petname");
		String vetName = request.getParameter("vetName");
		String signature = request.getParameter("signature");
		String clinicName = request.getParameter("clinicName");
		String story = request.getParameter("story") ;
		/**Server Side Sanitization **/
		userName = userName.replaceAll("[^\\dA-Za-z ]", " ").trim();
		city = city.replaceAll("[^\\dA-Za-z ]", " ").trim();
		petname = petname.replaceAll("[^\\dA-Za-z ]", " ").trim();
		vetName = vetName.replaceAll("[^\\dA-Za-z ]", " ").trim();
		signature = signature.replaceAll("[^\\dA-Za-z ]", " ").trim();
		clinicName = clinicName.replaceAll("[^\\dA-Za-z ]", " ").trim();
		story = story.replaceAll("[^\\dA-Za-z ]", " ").trim();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title> Assignment 2 part 4 </title></head>");
		out.println("<body>");
		out.println("<img src=\"images/logo.PNG\" alt=\"Pet health Insurance\" />");

		out.println("<table style=\"width:100%\" border=1>");
		out.println("<tr>");
		
		
		
		out.println(
				"<th><img src=\"images/success.gif\" alt=\"Pet health Insurance\" />You have successfully Submitted the following data</th>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<th>General Information</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>");
		out.println("<table>");
		out.println("<tr><td>Name</td><td>" + userName + "</td></tr>");
		out.println("<tr><td>Address:</td><td>" + request.getParameter("address") + "</td></tr>");
		out.println("<tr><td>City:</td><td>" + city+ "</td></tr>");
		out.println("<tr><td>Phone:</td><td>" + request.getParameter("phone") + "</td></tr>");
		out.println("<tr><td>Account Number:</td><td>" + request.getParameter("accountno") + "</td></tr>");
		out.println("<tr><td>Pet Name:</td><td>" + petname + "</td></tr>");
		out.println("<tr><td>Age:</td><td>" + request.getParameter("age") + "</td></tr>");
		out.println("</table>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Diagnosis/Symptom Informationo</th>");
		out.println("<tr><td>Story " + story + "</td></tr>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><table>");
		out.println("<tr><td>This claim is related to:</td><td>");
		String[] value = request.getParameterValues("claimCheckBox");
		if (value.length > 1) {
			for (int i = 0; i < value.length; i++) {
				out.println("<li>" + value[i].toString() + "</li><br>");
			}
		} else
			out.println("" + value[0].toString() + "<br>");
		out.println("</td></tr>");

		// out.println("<tr><td>This claim is related to:</td><td>"+
		// request.getParameter("claimCheckBox")+"</td></tr>");
		out.println("<tr><td>Veterinarian:</td><td>" + vetName + "</td></tr>");
		out.println("<tr><td>Is this claim an estimate for future treatment:</td><td>"
				+ request.getParameter("claimRadio") + "</td></tr>");
		out.println("<tr><td>Clinic name:</td><td>" + clinicName + "</td></tr>");
		out.println("<tr><td>Total Amount Claimed:</td><td>" + request.getParameter("totalAmt") + "</td></tr>");
		out.println("<tr><td>Phone Number:</td><td>" + request.getParameter("phoneNum2") + "</td></tr>");
		out.println("<tr><td>Send payment to:</td><td>");
		String[] value1 = request.getParameterValues("claimCheckBox2");
		if (value1.length > 1) {
			for (int i = 0; i < value1.length; i++) {
				out.println("<li>" + value1[i].toString() + "</li><br>");
			}
		} else
			out.println("" + value1[0].toString() + "<br>");
		out.println("</td></tr>");
		// out.println("<tr><td>Send payment
		// to:</td><td>"+request.getParameter("claimCheckBox2")+"</td></tr>");
		out.println(
				"<tr><td>Did any other vet check your pet?</td><td>" + request.getParameter("vetRadio") + "</td></tr>");
		out.println("<tr><td>Is this a new condition?</td><td>" + request.getParameter("vetRadio2") + "</td></tr>");
		out.println("</table>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>Pet Owner Declaration</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><table>");
		out.println("<tr><td>Signature:</td><td>" +signature + "</td></tr>");
		out.println("<tr><td>Date:</td><td>" + request.getParameter("signingDate") + "</td></tr>");
		out.println("</table>");
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");

		out.println("</body>");
		out.println("</html>");
	}

}
