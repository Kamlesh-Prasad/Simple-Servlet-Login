import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class Login extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html>");
out.println("<head>");
out.println("<title>Home Page</title>");
out.println("</head>");
out.println("<body>");


String username=req.getParameter("username");
String password=req.getParameter("password");

if(username.equals("admin")&&password.equals("123456"))
{
  out.println("<h1 style='text-align:center;'>Welcome To Home Page</h1><br><br><br>");
  out.println("<h2>Welcome : "+username+"</h2>");
  out.println("<h2>Your Password: "+password+"</h2>");
}
else
{
  out.println("<h1 style='text-align:center;'>Sorry Username or Password Error</h1><br><br><br>");
  out.println("<a href='index.html'><h3>Try Again</h3></a>");
}
out.println("</body>");
out.println("</html>");
}
}//class
