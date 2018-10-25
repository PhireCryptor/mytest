package comp3613.AccessDenied.server;

import comp3613.AccessDenied.client.GreetingService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;


public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {

	@Override
	public String greetServer(String name) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

}