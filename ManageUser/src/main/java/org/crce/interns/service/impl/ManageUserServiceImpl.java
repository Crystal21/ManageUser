package org.crce.interns.service.impl;

import org.crce.interns.beans.StudentBean;
import org.crce.interns.dao.ManageUserDao;
import org.crce.interns.model.Student;
import org.crce.interns.service.ManageUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;




@Service("manageUserService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ManageUserServiceImpl implements ManageUserService {
	
	@Autowired
	private ManageUserDao manageUserDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addStudent(StudentBean studentBean) {
		Student student = new Student();
		BeanUtils.copyProperties(studentBean, student);
		student.setRole_id("1");
		manageUserDao.createStudent(student);
	}

}
