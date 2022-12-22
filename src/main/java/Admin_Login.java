

import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Admin_Login
 */
@WebServlet("/Admin_Login")
public class Admin_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		
		DatabaseManager db = new DatabaseManager();
		java.sql.Connection con = db.getConnection();
		
		String name = request.getParameter("aName");
		String pass = request.getParameter("password");
		
		try {
			
			PreparedStatement st = con.prepareStatement("select * from adminlogin where aName = '"+name+"' and aPassword = '"+pass+"'");
			ResultSet rs = ((java.sql.Statement)st).executeQuery("select * from adminlogin where aName = '"+name+"' and aPassword = '"+pass+"'");
			
			if (rs.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("aName", name);
				response.sendRedirect("welcome_admin.jsp");
			}else {
				//System.out.println("Wrong Credential");
				//out.println("Wrong Credential");
				response.sendRedirect("wrong_credentials.jsp");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
