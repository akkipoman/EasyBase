import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class c1 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		
		HttpSession hp=req.getSession(true);
		String s=req.getParameter("table");
		hp.setAttribute("table",s);

		res.sendRedirect("field.html");
	}
}
	
