package com.skilrock.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skilrock.project.entities.Students;
import com.skilrock.project.services.StudentService;
@RestController
public class Controller {
	@Autowired
	private StudentService studentservice;
	
	@GetMapping("/")
	public String home()
	{
		return "Welcome";	
	}
	@GetMapping("/students")
	public List<Students> getstudents()
	{
		return this.studentservice.getstudents();
	}
	@GetMapping("/students/{id}")
	public Students getstudent(@PathVariable String id)
	{
		return this.studentservice.getstudent(Long.parseLong(id));
	}
	
	@PostMapping("/students")
	public Students addstudent(@RequestBody Students student)
	{
		return this.studentservice.addstudent(student);
	}
	
	@PutMapping("/students")
	public Students updatestudent(@RequestBody Students student)
	{
		return this.studentservice.updatestudent(student);
	}
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity<HttpStatus> deletestudent(@PathVariable String id)
	{
		try {
			this.studentservice.deletestudent(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
