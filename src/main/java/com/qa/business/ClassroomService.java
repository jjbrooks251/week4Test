package com.qa.business;

public interface ClassroomService {

	String getAllClassrooms();

	String getCLassrooms(long id);

	String createClassroom(String classroom);

	String deleteClassroom(long id);

	String updateClassroom(long id, String classroom);

}
