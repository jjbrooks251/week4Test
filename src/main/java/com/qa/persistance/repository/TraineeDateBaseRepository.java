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

		if (train1 != null) {

			return util.getJSONForObject(train1);
		} else {
			return "{\"message\": \"Trainee doesn't exist\"}";
		}
	}

	@Transactional(TxType.REQUIRED)
	@Override
	public String deleteTrainee(long id) {
		Trainee tar1 = manager.find(Trainee.class, id);

		if (tar1 != null) {
			manager.remove(tar1);
			return "{\"message\": \"Trainee Deleted\"}";
		} else {
			return "{\"message\": \"Trainee with this id doesn't exist\"}";
		}
	}

	@Transactional(TxType.REQUIRED)
	@Override
	public String createTrainee(String trainee) {

		Trainee tar1 = util.getObjectForJSON(trainee, Trainee.class);

		long id = tar1.getId();

		if (manager.find(Trainee.class, id) != null) {
			return "{\"message\": \"Trainee with this id already exists\"}";
		} else {

			manager.persist(tar1);

			return "{\"message\": \"Trainee Deleted\"}";
		}
	}

	@Transactional(TxType.REQUIRED)
	@Override
	public String updateTrainee(long id, String trainee) {

		Trainee oldTra = manager.find(Trainee.class, id);
		Trainee newTra = util.getObjectForJSON(trainee, Trainee.class);

		if (oldTra != null) {
			oldTra.setFirstName(newTra.getFirstName());
			oldTra.setLastName(newTra.getLastName());

			manager.persist(oldTra);
			return "{\"message\": \"Trainee Updated\"}";

		} else {
			return "{\"message\": \"Trainee does not exist\"}";
		}

	}
}
