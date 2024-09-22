package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentRepository;
import com.student.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	//Save Student
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	//Get All Student
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
	}
	
	//Get Student By Id
	public Student getStudentById(int id) {
		return studentRepository.findById(id).orElse(null);
	}
	
	//Update Student
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	
	//Delete Student
	public void deleteStudentById(int id) {
		studentRepository.deleteById(id);
	}
}
