package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Launch1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name =req.getParameter("uname");
		String pass = req.getParameter("upass");
		
		if(name.equals("admin") && pass.equals("123")) 
		{
			String url = "home.jsp?check="+name;
			resp.sendRedirect(url);
		}
		else {
			resp.sendRedirect("login.html");
		}
	}
}
