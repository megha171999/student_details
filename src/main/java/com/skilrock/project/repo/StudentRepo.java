package com.skilrock.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilrock.project.entities.Students;

public interface StudentRepo extends JpaRepository<Students,Long>{

}
