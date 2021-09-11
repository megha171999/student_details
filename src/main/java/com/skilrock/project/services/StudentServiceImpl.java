package com.skilrock.project.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilrock.project.dao.StudentsDao;
import com.skilrock.project.entities.Students;
import com.skilrock.project.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentsDao studentdao;
	
//	List<Students> list;
	
	public StudentServiceImpl()
	{
//		list=new ArrayList<>();
//		list.add(new Students(10,"Soumya Bag","7430982294"));
//		list.add(new Students(20,"Megha Pal","8250246120"));
//		list.add(new Students(30,"Aniket Bhosale","9933523954"));
	}

	@Override
	public List<Students> getstudents() {
		return studentdao.getAllStudents();
	}

	@Override
	public Students getstudent(long id) {
//		Students s=null;
//		for(Students student:list)
//		{
//			if(student.getId()==id)
//			{
//				s=student;
//				break;
//			}
//		}
		return studentdao.getStudentById(id);
	}

	@Override
	public Students addstudent(Students student) {
//		list.add(student);
		return studentdao.addStudent(student);
	}

	@Override
	public Students updatestudent(Students student) {
//		list.forEach(e -> {
//			if(e.getId()==student.getId()) {
//				e.setName(student.getName());
//				e.setNumber(student.getNumber());
//			}
//		});
		return studentdao.updateStudent(student);
	}

	@Override
	public void deletestudent(long id) {
//		list=this.list.stream().filter(e -> e.getId()!=parseLong).collect(Collectors.toList());
        this.studentdao.deleteStudent(id);
	}
	

}
