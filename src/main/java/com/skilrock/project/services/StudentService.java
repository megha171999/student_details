package com.skilrock.project.services;

import java.util.List;

import com.skilrock.project.entities.Students;

public interface StudentService {

	public List<Students> getstudents();

	public Students getstudent(long id);

	public Students addstudent(Students student);

	public Students updatestudent(Students student);

	public void deletestudent(long parseLong);

}
