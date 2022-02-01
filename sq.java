package jan2022;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sq extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int p= (int) req.getAttribute("k");
		//p *=p;
		res.getWriter().println("redirect" + p);
	}

}
