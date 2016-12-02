package com.soapassion;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/api")
@Produces({ "text/plain" })
public class HelloWorld {
	
	@GET
	@Path("/sayHello/{name}")
	@Produces({ "text/plain" })
	public String sayHello(@PathParam("name")String name){
		return null;
	}
	
	
	@GET
	@Path("/sayGoodbye/{name}")
	@Produces({ "text/plain" })
	public String sayGoodBye(@PathParam("name")String name){
		return null;
	}

}
