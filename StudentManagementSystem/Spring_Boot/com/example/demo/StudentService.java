package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class StudentService {
	@Autowired	
	private StudentRepository repo;
	public Student registerStudent( Student s)
	{
		return repo.save(s);
	}
	public List<Student> getStudents() {
		 return (List<Student>) repo.findAll();
		
	}
	public void deleteStudent(Integer id)
	{
		 repo.deleteById(id);
	}
	public Student updateStudent ( Student s)
	{
		Integer rollNumber= s.getRollNumber();
		Student std =repo.findById(rollNumber).get();
		std.setName(s.getName());
		std.setAddress(s.getAddress());
		std.setPercentage(s.getPercentage());
		return repo.save(std);
	}
	public Student get(Integer  id)
	{
		return repo.findById(id).get();
		
	}
	
}
