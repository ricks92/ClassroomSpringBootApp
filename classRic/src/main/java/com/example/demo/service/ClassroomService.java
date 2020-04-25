package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Classroom;
import com.example.demo.model.Student;
import com.example.demo.model.dao.ClassRepository;

@Service
public class ClassroomService {

	@Autowired
	private ClassRepository classRepository;
	
	
	public List<Student> getStudentsInAClass(int id){
		Optional<Classroom> classroom=classRepository.findById(id);
		
		List<Student> students=new ArrayList<>();
		
		if(classroom.isPresent()){
			students=classroom.get().getStudents();
		}
		
		return students;
	}
}
