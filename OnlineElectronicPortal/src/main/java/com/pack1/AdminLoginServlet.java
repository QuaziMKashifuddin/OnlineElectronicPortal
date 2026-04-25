package com.pack1;

import java.io.IOException;
import java.rmi.ServerException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/alog")
public class AdminLoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		AdminBean abean = new AdminLoginDAO().checkAdminLogin(req.getParameter("a_name"),req.getParameter("a_pwd"));
		if (abean==null)
		{
			req.setAttribute("msg", "Invalid Admin login credentials");
			req.getRequestDispatcher("AdminLogin.html").forward(req, res);
		}
		else
		{
			HttpSession session = req.getSession();
			session.setAttribute("abean", abean);
			req.getRequestDispatcher("AdminHome.jsp").forward(req, res);
		}
	}
	
}










