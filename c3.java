import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class c3 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();

		HttpSession hp=req.getSession(true);
		String s[]={"number","varchar","date","memo","object","boolean"};

		int n=Integer.parseInt(hp.getAttribute("field").toString());
		
		out.println("<form method='get' action='./fld'>");
		
		for(int i=1;i<=n;i++)
		{
			out.println("<input type='text' name='t"+i+"'>");
			out.println("<select name='s"+i+"'>");
			for(int j=0;j<s.length;j++)
			{

				out.println("<option name=' "+s[j]+" '>"+s[j]+"</option>");
				//out.println("<option> a</option>");
			}
			out.println("</select>");
			out.println("<br>");
			
		}

		out.println("<input type='submit' value='Submit'>");
		out.println("<input type='reset' value=''Clear'>");
	
	}
}
	
