package com.jrp.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jrp.pma.entities.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

	@Override
	public List<Project> findAll();
}
