import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class c4 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		Connection cn;Statement st;
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String f[]=new String[20];
		String d[]=new String[20];
		HttpSession hp=req.getSession(true);
		int n=Integer.parseInt(hp.getAttribute("field").toString());
		String tab=hp.getAttribute("table").toString();
		for(int i=0;i<n;i++)
		{
			f[i]=req.getParameter("t"+(i+1));
			d[i]=req.getParameter("s"+(i+1));
		}
		try
		{
      			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			cn=DriverManager.getConnection("Jdbc:Odbc:dnyanesh");
			st=cn.createStatement();
						
		

		String q;
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				q="create table "+tab+"( "+f[i]+" "+d[i]+")";
				st.executeUpdate(q);
			}
			else
			{
				q="alter table "+tab+" add "+f[i]+ " "+d[i]+"";
				st.executeUpdate(q);
				
			}

		}	
		out.println("<h1>Table created </h1>");
		}
		catch(Exception e)
		{
		}
		//String q="create table "+tab+"("+f[0]+" "+d[0]+", "+f[0]+" "+d[0]+", "
	}
}
	
