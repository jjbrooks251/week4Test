package com.qa.persistance.repository;

public interface TraineeRepository {

	String getAllTrainees();

	String getTrainee(long id);

	String deleteTrainee(long id);

}
