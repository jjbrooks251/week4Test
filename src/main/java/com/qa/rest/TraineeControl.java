package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.TraineeService;

@Path("/Trainee")
public class TraineeControl {

	@Inject
	private TraineeService service;

	@Path("/getAllTrainees")
	@GET
	@Produces({ "application/json" })
	public String getAllTrainees() {
		return service.getAllTrainees();
	}

	@Path("/getTrainee/{id}")
	@GET
	@Produces({ "application/json" })
	public String getTrainee(@PathParam("id") long id) {
		return service.getTrainee(id);
	}

	@Path("/deleteTrainee/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteTrainee(@PathParam("id") long id) {
		return service.deleteTrainee(id);
	}

	@Path("/createTrainee")
	@POST
	@Produces({ "application/json" })
	public String createClassroom(String trainee) {
		return service.createTrainee(trainee);
	}

	@Path("/updateTrainee/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateClassroom(@PathParam("id") long id, String trainee) {
		return service.updateTrainee(id, trainee);
	}
}
