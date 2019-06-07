package com.qa.persistance.repository;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.persistance.domain.Classroom;
import com.qa.util.JSONUtil;

@Transactional(TxType.SUPPORTS)
@Default
public class ClassroomDateBaseRepository implements ClassroomRepository {

	@Inject
	JSONUtil util;

	@PersistenceContext(unitName = "primary")
	EntityManager manager;

	@Override
	public String getAllClassrooms() {
		Query query = manager.createQuery("SELECT a FROM Classroom a");

		Collection<Classroom> classroom = (Collection<Classroom>) query.getResultList();

		return util.getJSONForObject(classroom);
	}

	@Override
	public String getCLassroom(long id) {

		Classroom class1 = manager.find(Classroom.class, id);

		return util.getJSONForObject(class1);
	}

	@Transactional(TxType.REQUIRED)
	@Override
	public String createClassroom(String classroom) {
		Classroom clas1 = util.getObjectForJSON(classroom, Classroom.class);

		manager.persist(clas1);
		return "{\"message\": \"New Account Created\"}";
	}

	@Transactional(TxType.REQUIRED)
	@Override
	public String deleteClassroom(long id) {
		Classroom clas1 = manager.find(Classroom.class, id);

		manager.remove(clas1);
		return "{\"message\": \"Classroom Deleted\"}";
	}

}
