package comp3613.AccessDenied.client;

import com.google.gwt.user.client.rpc.RemoteService;

/**
 * The client-side stub for the RPC service.
 */

public interface GreetingService extends RemoteService {
	String greetServer(String name) throws IllegalArgumentException;
}
