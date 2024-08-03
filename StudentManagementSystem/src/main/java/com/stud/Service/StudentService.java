package com.stud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stud.Entity.Student;
import com.stud.Repository.StudentRepository;

@Service
public class StudentService {

    @Autowired	
	private final StudentRepository studentRepository;
    
    public StudentService(StudentRepository studentRepository) {
    	this.studentRepository = studentRepository;
    }
    
    public Student save(Student s) {
    	return studentRepository.save(s);
    }
    
    public List<Student> findAll(){
    	return studentRepository.findAll();
    }
}
