package com.nt.training.Teacher;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository  extends JpaRepository<Teacher, Long>{
	
	@Query("SELECT t FROM Teacher t WHERE t.subject = ?1")
	Optional<Teacher> findTeacherBySubject(String subject);
}
