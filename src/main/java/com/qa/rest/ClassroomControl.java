package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.qa.business.ClassroomService;

@Path("/Classroom")
public class ClassroomControl {

	@Inject
	private ClassroomService service;

	@Path("/getAllClassrooms")
	@GET
	// @Produces({"application/json"})
	public String getAllAccounts() {
		return service.getAllClassrooms();
	}
}
