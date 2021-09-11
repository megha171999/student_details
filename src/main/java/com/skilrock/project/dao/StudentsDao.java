package com.skilrock.project.dao;

import java.util.List;

import com.skilrock.project.entities.Students;

public interface StudentsDao{
     public List<Students> getAllStudents();
     public Students getStudentById(long id);
     public Students addStudent(Students student);
     public Students updateStudent(Students student);
     public void deleteStudent(long id);
}
