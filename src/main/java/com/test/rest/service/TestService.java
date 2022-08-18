package com.test.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * Servicio Test RestServices
 * @author JMFERREIRA
 */
@Path("/")
public interface TestService {

	
	@POST
	@Path("/test/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response test()  throws Exception;
	
	
}
