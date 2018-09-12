package Flight;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fares")
public class Booked extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			resp.setContentType("text/html");
			String source= req.getParameter("source");
			String destination= req.getParameter("destination");
			
			int nop=Integer.parseInt(req.getParameter("nop"));
			int noc=Integer.parseInt(req.getParameter("noc"));
			
			
			Booking book=new Booking();
			int fare=book.calculateFare(source, destination, nop,noc);
			
			
			
			req.setAttribute("source", source);
			req.setAttribute("destination", destination);
			req.setAttribute("fare", fare);
			req.setAttribute("nop", nop);
		
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("fare_details.jsp");
			dispatcher.forward(req, resp);
			
			
			
	}
}
