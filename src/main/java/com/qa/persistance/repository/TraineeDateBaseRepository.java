package com.qa.persistance.repository;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.persistance.domain.Trainee;
import com.qa.util.JSONUtil;

@Transactional(TxType.SUPPORTS)
@Default
public class TraineeDateBaseRepository implements TraineeRepository {

	@Inject
	JSONUtil util;

	@PersistenceContext(unitName = "primary")
	EntityManager manager;

	@Override
	public String getAllTrainees() {
		Query query = manager.createQuery("SELECT a FROM Trainee a");

		Collection<Trainee> trainee = (Collection<Trainee>) query.getResultList();

		return util.getJSONForObject(trainee);
	}

	@Override
	public String getTrainee(long id) {
		Trainee train1 = manager.find(Trainee.class, id);

		return util.getJSONForObject(train1);
	}

	@Transactional(TxType.REQUIRED)
	@Override
	public String deleteTrainee(long id) {
		Trainee clas1 = manager.find(Trainee.class, id);

		manager.remove(clas1);
		return "{\"message\": \"Trainee Deleted\"}";
	}

}
