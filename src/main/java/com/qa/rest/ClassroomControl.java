package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.ClassroomService;

@Path("/Classroom")
public class ClassroomControl {

	@Inject
	private ClassroomService service;

	@Path("/getAllClassrooms")
	@GET
	@Produces({ "application/json" })
	public String getAllAccounts() {
		return service.getAllClassrooms();
	}

	@Path("/getClassroom/{id}")
	@GET
	@Produces({ "application/json" })
	public String getAccount(@PathParam("id") long id) {
		return service.getCLassrooms(id);
	}
}
