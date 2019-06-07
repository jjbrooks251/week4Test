package com.qa.business;

public interface TraineeService {

	String getAllTrainees();

	String getTrainee(long id);

	String deleteTrainee(long id);

	String createTrainee(String trainee);

	String updateTrainee(long id, String trainee);

}
