package com.test.rest.service.impl;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.test.rest.service.TestService;

/**
 * Implementación del servicio de Test Rest
 * @author JMFERREIRA
 * return String (Test realizado ok)
 */
public class TestServiceImpl implements TestService {

	Logger LOG = LoggerFactory.getLogger(TestServiceImpl.class);
	
	public Response test() throws Exception {
		
		LOG.info("Probando logs...");
		
		return Response.ok("Test realizado Ok", MediaType.APPLICATION_JSON).build();
	}

}
