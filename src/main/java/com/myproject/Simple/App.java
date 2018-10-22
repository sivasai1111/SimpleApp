package com.myproject.Simple;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 * Hello world!
 *
 */
@Path("/simple")
public class App 
{

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/ping")
	public String pingService() {
		return "Ping Service Executed Successfully";
	}
}
