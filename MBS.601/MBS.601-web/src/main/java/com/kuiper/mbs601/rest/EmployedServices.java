package com.kuiper.mbs601.rest;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kuiper.mbs601.mel.model.MessageRQ;
import com.kuiper.mbs601.mel.model.MessageRS;


@Path("/service/Employed") 
public class EmployedServices {
 
	
	@Path("/registre")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public MessageRS registreEmployed(MessageRQ messageRQ){
		return null;
	}
	
	@Path("/hello")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String hello(String name){
		return "Hello " + name + "!";
	}
}
