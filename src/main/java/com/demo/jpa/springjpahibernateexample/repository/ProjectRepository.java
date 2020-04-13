package com.demo.jpa.springjpahibernateexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.jpa.springjpahibernateexample.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
	
	List<Project> findByProjectName(String projectName);
	Project findByProjectId(Long projectId);
	List<Project> findByProjectStartDate(String projectStartDate);
	List<Project> findByTeamSize(String teamSize);
	List<Project> findByProjectlastAccessTime(String projectlastAccessTime);

}
