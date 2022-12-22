

import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class User_Login
 */
@WebServlet("/User_Login")
public class User_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/http");
		//PrintWriter out = response.getWriter();
		
		DatabaseManager db = new DatabaseManager();
		java.sql.Connection con = db.getConnection();
		
		String voterID = request.getParameter("voterID");
		
		try {
			
			PreparedStatement st = con.prepareStatement("select * from temp_voter_id where voterID = '"+voterID+"'");
			ResultSet rs = st.executeQuery("select * from temp_voter_id where voterID = '"+voterID+"'");
			
			if (rs.next()) {
				//out.println("Sorry! you have already been voted.");
				response.sendRedirect("sorry.jsp");
			}else {
				
				PreparedStatement st1 = con.prepareStatement("select * from voter where voter_id = '"+voterID+"'");
				ResultSet rs1 = st1.executeQuery("select * from voter where voter_id = '"+voterID+"'");
				
				if (rs1.next()) {
					response.sendRedirect("welcome_user.jsp");
				}
				else {
					//out.println("Please provide proper credentials!");
					response.sendRedirect("wrong_voterid.jsp");
				}
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
