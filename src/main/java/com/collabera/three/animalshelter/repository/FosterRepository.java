package com.collabera.three.animalshelter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collabera.three.animalshelter.model.Foster;

public interface FosterRepository extends JpaRepository<Foster, Integer>{
	
}