package com.ismav.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/user")
public class RoughController {

	@GET
	@Path("/{code}")
	@Produces("text/plain")
	public String getName(@PathParam("code") int number){
		if(number==007){
		return "vamsi";
		}else{
			return number+"";
		}
		
	}
	
}
