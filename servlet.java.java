import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class FirstServlet extends HttpServlet{
public void service(HttpServletRequest request, HttpServletResponse response)throws IOException{
String str=request.getParameter("sname");
String course=request.getParameter("ccourse");
PrintWriter out=response.getWriter();
response.setContentType("text/html");
Cookie ck1=new Cookie("sname",str);
Cookie ck2=new Cookie("ccourse",course);
response.addCookie(ck1);
response.addCookie(ck2);
out.println("<html><body>");
out.println(" hai " + str);
out.println("<a href='http://localhost:8000/Cookiesapp/second'>click here </a>");
out.println("</body></html>");
}
}