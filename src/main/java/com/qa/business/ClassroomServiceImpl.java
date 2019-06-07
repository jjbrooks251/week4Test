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

		return repo.getCLassroom(id);
	}

	@Override
	public String createClassroom(String classroom) {

		return repo.createClassroom(classroom);
	}

	@Override
	public String deleteClassroom(long id) {

		return repo.deleteClassroom(id);
	}

}
