

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		
		DatabaseManager db = new DatabaseManager();
		java.sql.Connection con = db.getConnection();
		
		//out.println("working");
		
		String name = request.getParameter("uName");
		String number = request.getParameter("phone_no");
		String email = request.getParameter("email");
		String comment = request.getParameter("comments");
		
		try {
			
			PreparedStatement st = con.prepareStatement("insert into contact(uName,pNumber,email,comnt) values('"+name+"','"+number+"','"+email+"','"+comment+"')");
			st.executeUpdate();
			response.sendRedirect("index.jsp");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
