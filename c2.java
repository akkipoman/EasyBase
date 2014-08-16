import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class c2 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		
		HttpSession hp=req.getSession(true);
		String s=req.getParameter("fields");
		hp.setAttribute("field",s);

		res.sendRedirect("fielddd");
	}
}
	
