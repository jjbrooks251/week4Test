package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
	public String getAllClassrooms() {
		return service.getAllClassrooms();
	}

	@Path("/getClassroom/{id}")
	@GET
	@Produces({ "application/json" })
	public String getClassroom(@PathParam("id") long id) {
		return service.getCLassrooms(id);
	}

	@Path("/createClassroom")
	@POST
	@Produces({ "application/json" })
	public String createClassroom(String account) {
		return service.createClassroom(account);
	}

	@Path("/deleteClassroom/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteClassroom(@PathParam("id") long id) {
		return service.deleteClassroom(id);
	}
}
