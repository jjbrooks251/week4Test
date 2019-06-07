package com.qa.business;

import javax.inject.Inject;

import com.qa.persistance.repository.TraineeRepository;

public class TraineeServiceImpl implements TraineeService {

	@Inject
	TraineeRepository repo;

	@Override
	public String getAllTrainees() {

		return repo.getAllTrainees();
	}

}
