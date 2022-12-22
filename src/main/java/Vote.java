

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
 * Servlet implementation class Vote
 */
@WebServlet("/Vote")
public class Vote extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		
		DatabaseManager db = new DatabaseManager();
		java.sql.Connection con = db.getConnection();
		
		String voterID = request.getParameter("voterNo");
		String partieName = request.getParameter("partyName");
		//out.println(partieName);
		//out.println(voterID);
		try {
			PreparedStatement st = con.prepareStatement("select * from temp_voter_id where voterID = '"+voterID+"'");
			ResultSet rs = st.executeQuery("select * from temp_voter_id where voterID = '"+voterID+"'");
			
			if (rs.next()) {
				//out.println("Sorry! you have already been voted.");
				response.sendRedirect("sorry.jsp");
			}else {
				PreparedStatement st1 = con.prepareStatement("insert into vote(voter_id,partie)values('"+voterID+"','"+partieName+"')");
				PreparedStatement st2 = con.prepareStatement("insert into temp_voter_id(voterID)values('"+voterID+"')");
				st1.executeUpdate();
				st2.executeUpdate();
				response.sendRedirect("thankyou.jsp");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
