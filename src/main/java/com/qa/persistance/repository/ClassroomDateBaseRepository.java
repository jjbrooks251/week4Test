package com.qa.persistance.repository;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.persistance.domain.Classroom;
import com.qa.util.JSONUtil;

@Default
public class ClassroomDateBaseRepository implements ClassroomRepository {

	@Inject
	JSONUtil util;

	@PersistenceContext(unitName = "primary")
	EntityManager manager;

	@Override
	public String getAllClassrooms() {
		Query query = manager.createQuery("SELECT a FROM Account a");

		Collection<Classroom> accounts = (Collection<Classroom>) query.getResultList();

		return util.getJSONForObject(accounts);
	}

}
