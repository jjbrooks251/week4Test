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

	@Override
	public String getCLassrooms(long id) {
		// TODO Auto-generated method stub
		return repo.getCLassroom(id);
	}

}
