package com.demo.jpa.springjpahibernateexample.resource;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jpa.springjpahibernateexample.model.Project;
import com.demo.jpa.springjpahibernateexample.repository.ProjectRepository;

@RestController
@RequestMapping("/api/projects")
public class ProjectResource {
	
	@Autowired
	ProjectRepository projectRepository;
	
	@GetMapping(path="/all")
	public List<Project>  displayAllProject() {
		return projectRepository.findAll();
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path="/{Id}")
	public Project findProjectByProjectId(@PathVariable("Id") Long projectId) {
		return projectRepository.findByProjectId(projectId);
	}
	
	@PostMapping(path="/save/bulk")
	public void saveBulkProject() {
		projectRepository.saveAll(createBulkProjectSamples());
	}
	
	@PostMapping(path="/save")
	public Project saveProject(Project project) {
		return projectRepository.save(project);
	}
	
	@PutMapping(path="/update" , consumes = MediaType.APPLICATION_JSON_VALUE , 
			produces = MediaType.APPLICATION_JSON_VALUE )
	public Project updateProject(Project prj) {
		return projectRepository.save(prj);
	}

	@DeleteMapping("/delete")
	public void deleteProject(Project prj) {
		projectRepository.delete(prj);
	}
	
	@DeleteMapping("/delete/{Id}")
	public void deleteProjectById(@PathVariable("Id") Long projectId) {
		projectRepository.deleteById(projectId);
	}	
	
	@DeleteMapping("/delete/all")
	public void deleteAllProjects() {
		projectRepository.deleteAll();
		
	}
	
	
	private List<Project> createBulkProjectSamples() {
		List<Project> projectList = new ArrayList<Project>();
		for (int i = 0; i < 14; i++) {
			Project prj = new Project();
			prj.setProjectName("Project"+i);
			prj.setProjectStartDate(LocalDate.now());
			prj.setProjectlastAccessTime(LocalDateTime.now());
			prj.setTeamSize(i);
			projectList.add(prj);
		}
		return projectList;
	}
	
	

}
