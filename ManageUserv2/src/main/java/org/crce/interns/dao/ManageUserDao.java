package org.crce.interns.dao;

import org.crce.interns.model.Faculty;
import org.crce.interns.model.Student;

public interface ManageUserDao {

	public void createStudent(Student student);
	public void createFaculty(Faculty faculty);
}
