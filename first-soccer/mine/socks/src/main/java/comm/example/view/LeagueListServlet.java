package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.league;

/**
 * Servlet implementation class LeagueListServlet
 */
public class LeagueListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<league> list = null;
	
	protected void doProcessRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		list = new ArrayList<league>();
		list.add(new league("the hopping bunny",2015,"easter"));
		list.add(new league("witch's wart",1997,"halloween"));
		out.println("<html><head><title>lala</title></head><body><table><tr><td>title</td><td>year</td><td>season</td></tr>");
		for(league l:list) {
			out.print("<tr><td>"+l.getTitle()+"</td><td>"+l.getYear()+"</td><td>"+l.getSeason()+"</td></tr>");
		}
		out.println("</table><a href='index.html'>Go To Home Page</a></body></html>");
	}
	
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcessRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcessRequest(request, response);
	}

}
