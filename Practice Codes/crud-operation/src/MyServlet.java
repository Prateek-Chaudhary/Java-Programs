import java.io.*;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/crud")
public class MyServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter pw = response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sqltutorial","root","JattaA@123");
			String query = "insert into validation values(?,?)";
			PreparedStatement ps = cn.prepareStatement(query);
			String u = request.getParameter("uname");
			String p = request.getParameter("pass");
			ps.setString(1, u);
			ps.setString(2, p);
			ps.execute();
			RequestDispatcher rd = request.getRequestDispatcher("add.html");
			rd.include(request, response);
			pw.println("<h2>Successfully inserted</h2>");
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
