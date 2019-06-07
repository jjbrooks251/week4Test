package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.qa.business.TraineeService;

@Path("/Trainee")
public class TraineeControl {

	@Inject
	private TraineeService service;

	@Path("/getAllTrainees")
	@GET
	// @Produces({"application/json"})
	public String getAllTrainees() {
		return service.getAllTrainees();
	}
}
