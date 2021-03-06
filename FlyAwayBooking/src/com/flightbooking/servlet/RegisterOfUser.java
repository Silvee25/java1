package com.flightbooking.servlet;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.flightbooking.database.ConnectionUtil;
/**
 * Servlet implementation class RegisterOfUser
 */
@WebServlet("/RegisterOfUser")
public class RegisterOfUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterOfUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String phno=request.getParameter("phno");
		String adno=request.getParameter("adno");
		HashMap<String,String> user=new HashMap<>();
		user.put("email", email);
		user.put("password", password);
		user.put("name", name);
		user.put("phno", phno);
		user.put("adno", adno);
		try {
		ConnectionUtil dao=new ConnectionUtil();
		boolean result=dao.insertUser(user);
		HttpSession session=request.getSession();
		if(result) {
		session.setAttribute("message", "User Adde Successfully");
		}
		else {
		session.setAttribute("message","Invalid Details");
		}
		} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		response.sendRedirect("UserPage.jsp");

	}

}
