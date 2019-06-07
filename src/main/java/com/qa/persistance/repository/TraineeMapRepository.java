package com.qa.persistance.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.qa.persistance.domain.Trainee;
import com.qa.util.JSONUtil;

@Alternative
public class TraineeMapRepository implements TraineeRepository {

	@Inject
	JSONUtil util;

	@PersistenceContext(unitName = "primary")
	EntityManager manager;

	private Map<Integer, Trainee> traineeMap = new HashMap<Integer, Trainee>();

	public Map<Integer, Trainee> getTraineeMap() {
		return traineeMap;
	}

	public void setTraineeMap(Map<Integer, Trainee> traineeMap) {
		this.traineeMap = traineeMap;
	}

	@Override
	public String getAllTrainees() {
		// TODO Auto-generated method stub
		return traineeMap.toString();
	}

}
