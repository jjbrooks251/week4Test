package com.qa.persistance.repository;

public interface ClassroomRepository {

	String getAllClassrooms();

	String getCLassroom(long id);

	String createClassroom(String classroom);

	String deleteClassroom(long id);
}
