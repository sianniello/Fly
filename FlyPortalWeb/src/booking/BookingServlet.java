package booking;

import java.io.IOException;
import java.util.TreeMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import flight.Flight;



/**
 * Servlet implementation class FlightServlet
 */
@WebServlet("/FlightServlet")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private BookingBeanLocal bookingBean;
       private TreeMap<String, Flight> booking;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
