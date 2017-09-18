package com.cts.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.service.AdminService;

public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String choice=request.getParameter("adminOption");
		AdminService service=new AdminService();
		request.setAttribute("Banks", service.displayBanks());
		if(choice.equalsIgnoreCase("add"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("AddBank.jsp");
			dispatcher.forward(request, response);
		}
		else if(choice.equalsIgnoreCase("modify"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("ModifyBank.jsp");
			request.setAttribute("Banks", service.displayBanks());
			dispatcher.forward(request, response);
		}
		else if(choice.equalsIgnoreCase("delete"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("DeleteBank.jsp");
			dispatcher.forward(request, response);
		}
		else if(choice.equalsIgnoreCase("display"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("DisplayBanks.jsp");
			dispatcher.forward(request, response);
		}
	}

}
