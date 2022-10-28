import java.io.IOException;
import java.sql.DriverManager;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/mypage")
public class MyServlet extends HttpServlet {
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sqltutorial","root","JattaA@123");
			String userid = request.getParameter("uid");
			String password = request.getParameter("pass");
			if(userid.equals("myname") && password.equals("mypass")) {
				pw.println("<h1> Id and Password is correct </h1>");
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
