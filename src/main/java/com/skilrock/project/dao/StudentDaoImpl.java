package com.skilrock.project.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilrock.project.entities.Students;
import com.skilrock.project.repo.StudentRepo;
@Service
public class StudentDaoImpl implements StudentsDao {
	@Autowired
	private StudentRepo studentrepo;

	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		List<Students> list=this.studentrepo.findAll();
		return list;
	}

	@Override
	public Students getStudentById(long id) {
		// TODO Auto-generated method stub
		Optional<Students> op= studentrepo.findById(id);
		return op.get();
	}

	@Override
	public Students addStudent(Students student) {
		// TODO Auto-generated method stub
		return this.studentrepo.save(student);
	}

	@Override
	public Students updateStudent(Students student) {
		// TODO Auto-generated method stub
		return this.studentrepo.save(student);
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		Students entity = studentrepo.getOne(id);
		studentrepo.delete(entity);
	}
	

}
