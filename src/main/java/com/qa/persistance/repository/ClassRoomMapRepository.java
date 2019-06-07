package com.qa.persistance.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.qa.persistance.domain.Classroom;
import com.qa.util.JSONUtil;

@Alternative
public class ClassRoomMapRepository implements ClassroomRepository {

	@Inject
	JSONUtil util;

	@PersistenceContext(unitName = "primary")
	EntityManager manager;

	private Map<Integer, Classroom> classroomMap = new HashMap<Integer, Classroom>();

	public Map<Integer, Classroom> getClassroomMap() {
		return classroomMap;
	}

	public void setClassroomMap(Map<Integer, Classroom> classroomMap) {
		this.classroomMap = classroomMap;
	}

	@Override
	public String getAllClassrooms() {

		return classroomMap.toString();
	}

}
