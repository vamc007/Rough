package com.ismav.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class RoughController {

	@GET
	@Produces("text/plain")
	public String getName(){
		return "vamsinath";
	}
	
}
