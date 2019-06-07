package com.qa.persistance.repository;

public interface TraineeRepository {

	String getAllTrainees();

	String getTrainee(long id);

	String deleteTrainee(long id);

	String createTrainee(String trainee);

	String updateTrainee(long id, String trainee);

}
