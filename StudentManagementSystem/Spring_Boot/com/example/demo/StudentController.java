package com.example.demo;


import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class StudentController {
	@Autowired 
	private StudentService service;
	@PostMapping("/registerStudent")
	public Student registerStudent(@RequestBody Student s)
	{
		return service.registerStudent(s);
	}
	@GetMapping("/getStudents")
	
	public List<Student> getStudents()
	{
		return service.getStudents();
		
	}
	@DeleteMapping("/deleteStudent")
	public void deleteStudent(@RequestParam Integer id)
	{
		service.deleteStudent(id);
	}
	@PutMapping("/updateStudent")
	public ResponseEntity<Student> updateStudent (@RequestBody Student s)
	{
//		return service.updateStudent(s);
		try {
			@SuppressWarnings("unused")
			Student s1=service.updateStudent(s);
			service.registerStudent(s);
			return new ResponseEntity<Student>(s,HttpStatus.OK);
		
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	
	@GetMapping("/getStudents/{id}")
	public ResponseEntity<Student> get(@PathVariable Integer id)
	{
		try {
			Student s=service.get(id);
			return new ResponseEntity<Student>(s,HttpStatus.OK);
		
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		
		
	}
	}
	
	

