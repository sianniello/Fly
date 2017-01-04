package flights;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import replica.ReplicaManagerBean;
import replica.ReplicaManagerBeanLocal;
import flight.FlightException;

/**
 * Session Bean implementation class DeleteFlightBean
 */
@Stateless
@LocalBean
public class DeleteFlightBean implements DeleteFlightBeanLocal {

	private ReplicaManagerBeanLocal rm;
	/**
	 * Default constructor. 
	 */
	public DeleteFlightBean() {
	}

	@Override
	public boolean deleteFlight(String f) throws FlightException {
		rm = new ReplicaManagerBean();
		rm.init();
		String query = "DELETE FROM flights WHERE flight='" + f + "';";

		try{
			if(rm.executeUpdate(query))
				return true;
		}
		catch(Exception e){
			e.printStackTrace();
			throw new FlightException("Flight not present");
		}
		throw new FlightException("Flight not present");
	}

}
