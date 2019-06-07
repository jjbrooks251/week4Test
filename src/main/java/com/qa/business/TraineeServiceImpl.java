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

	@Override
	public String getTrainee(long id) {
		return repo.getTrainee(id);
	}

	@Override
	public String deleteTrainee(long id) {
		return repo.deleteTrainee(id);
	}

}
