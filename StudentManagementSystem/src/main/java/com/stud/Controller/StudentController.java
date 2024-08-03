package com.stud.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stud.Entity.Student;
import com.stud.Service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	private final StudentService service;
	
	public StudentController(StudentService service) {
		this.service=service;
	}
	
	@PostMapping
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		return ResponseEntity.ok(service.save(student));
	}
	
	@GetMapping
	public ResponseEntity<List<Student>> getAllStudents(){
		return ResponseEntity.ok(service.findAll());
	}
}
