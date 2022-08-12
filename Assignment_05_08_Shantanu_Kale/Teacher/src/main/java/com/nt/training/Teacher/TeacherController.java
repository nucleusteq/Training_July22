package com.nt.training.Teacher;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/teacher")
public class TeacherController {
	
	private final TeacherService teacherService;
	
	
	@Autowired
	public TeacherController(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@GetMapping
	public List<Teacher> getTeacher(){
		return teacherService.getTeacher();
	}
	
	@PostMapping
	public void entryNewTeacher(@RequestBody Teacher teacher) {
		teacherService.addNewTeacher(teacher);
	}
	
	@DeleteMapping(path = "{teacherId}")
	public void deleteTeacher(@PathVariable("teacherId") Long teacherId) {
		teacherService.deleteTeacher(teacherId);
	}
	
	@PutMapping(path = "{teacherId}")
	public void updateTeacher(
			@PathVariable("teacherId") Long teacherId,
			@RequestParam(required = false) String name,
			@RequestParam(required = false) String subject
			) {teacherService.updateTeacher(teacherId, name, subject);
		
	}
}
