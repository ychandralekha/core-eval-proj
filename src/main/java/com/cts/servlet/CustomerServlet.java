package com.cts.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.pojo.CustomerDetails;

/**
 * Servlet implementation class CustomerServlet
 */
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Map<String, String[]>accountDetails=request.getParameterMap();
	if(accountDetails.containsKey("CustomerRegister"))
	{
		String accountType=request.getParameter("accountType");
		if(accountType.equalsIgnoreCase("Savings"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("SavingsPage");
			dispatcher.forward(request, response);
		}
		else if(accountType.equalsIgnoreCase("Fixed"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("FixedPage");
			dispatcher.forward(request, response);
		}
	}
	else if(accountDetails.containsKey("SavingsPage"))
	{
		CustomerDetails customerDetails=new CustomerDetails();
		
	}
	}

}
