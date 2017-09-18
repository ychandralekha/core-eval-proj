package com.cts.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.service.AdminService;


public class AdminOperation extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String[]>page=request.getParameterMap();
		AdminService service=new AdminService();
		boolean result;
		if(page.containsKey("addBank"))
		{
		String bankName=request.getParameter("bankName");
		result=service.adminAddBank(bankName);
		RequestDispatcher dispatcher=request.getRequestDispatcher("AdminPage.jsp");
		dispatcher.forward(request, response);
		}
		else if(page.containsKey("modifyBank"))
		{
			String oldName =request.getParameter("BankName");
			String newName=request.getParameter("newname");
			System.out.println(oldName+":"+newName);
			result=service.adminModifyBank(oldName, newName);
			RequestDispatcher dispatcher=request.getRequestDispatcher("AdminPage.jsp");
			dispatcher.forward(request, response);
		}
		else if(page.containsKey("displayBank"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("AdminPage.jsp");
			dispatcher.forward(request, response);
		}
		else if(page.containsKey("deleteBank"))
		{
			String bankName=request.getParameter("bank");
			service.adminDeleteBank(bankName);
			RequestDispatcher dispatcher=request.getRequestDispatcher("AdminPage.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
