package com.demo.jpa.springjpahibernateexample.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "project")
@DynamicUpdate
public class Project {

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name = "projectId")
	private Long projectId;
	
	 @Column(name="projectName")
	private String projectName;
	
	 @Column(name="projectDateTime")
	 private LocalDateTime projectlastAccessTime;
	
	 @Column(name="projectStartDate")
	 private LocalDate projectStartDate;
	
	 @Column(name="teamSize")
	 private Integer teamSize;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public LocalDateTime getProjectlastAccessTime() {
		return projectlastAccessTime;
	}

	public void setProjectlastAccessTime(LocalDateTime projectlastAccessTime) {
		this.projectlastAccessTime = projectlastAccessTime;
	}

	public LocalDate getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(LocalDate projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectlastAccessTime="
				+ projectlastAccessTime + ", projectStartDate=" + projectStartDate + ", teamSize=" + teamSize + "]";
	}
	 
	 
}
