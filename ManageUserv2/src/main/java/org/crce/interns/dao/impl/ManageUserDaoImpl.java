package org.crce.interns.dao.impl;

import org.crce.interns.dao.ManageUserDao;
import org.crce.interns.model.Faculty;
import org.crce.interns.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("manageUserDao")
public class ManageUserDaoImpl implements ManageUserDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void createStudent(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);
	}

	public void createFaculty(Faculty faculty) {
		sessionFactory.getCurrentSession().saveOrUpdate(faculty);
	}
}
