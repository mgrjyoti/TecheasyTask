package com.stud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stud.Entity.Subject;
import com.stud.Service.SubjectService;

@RestController
@RequestMapping("/'subjects")
public class SubjectController {

	@Autowired
	private final SubjectService subjectService;
	
	public SubjectController(SubjectService subjectService) {
		this.subjectService=subjectService;
	}
	
	@GetMapping
	public ResponseEntity<List<Subject>> getAllSubjects(){
		return ResponseEntity.ok(subjectService.findAll());
	}
}
