package com.qa.business;

import javax.inject.Inject;

import com.qa.persistance.repository.ClassroomRepository;

public class ClassroomServiceImpl implements ClassroomService {

	@Inject
	ClassroomRepository repo;

	@Override
	public String getAllClassrooms() {

		return repo.getAllClassrooms();
	}

}
