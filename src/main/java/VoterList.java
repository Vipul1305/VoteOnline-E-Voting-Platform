

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VoterList
 */
@WebServlet("/VoterList")
public class VoterList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DatabaseManager db = new DatabaseManager();
		java.sql.Connection con = db.getConnection();
		
		String name = request.getParameter("uName");
		String phone = request.getParameter("phone_no");
		String email = request.getParameter("email");
		String voterNo = request.getParameter("voterNo");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		
		try {
			
			PreparedStatement st = con.prepareStatement("insert into voter(name,phone_no,email,voter_id,address,Date_OF_Barth)values ('"+name+"','"+phone+"','"+email+"','"+voterNo+"','"+address+"','"+dob+"')");
			st.executeUpdate();
			response.sendRedirect("welcome_admin.jsp");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
