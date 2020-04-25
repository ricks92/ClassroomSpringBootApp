package com.example.demo.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Classroom;

@Repository
public interface ClassRepository extends JpaRepository<Classroom, Integer>{

}
