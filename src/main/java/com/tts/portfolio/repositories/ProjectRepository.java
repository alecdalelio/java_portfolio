package com.tts.portfolio.repositories;

import com.tts.portfolio.models.Project;

import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long>{
    
}
