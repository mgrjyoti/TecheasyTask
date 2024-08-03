package com.stud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stud.Entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
