package com.EmployeeActivityUsecase.Java.Dto;

import java.time.LocalDate;

public class GetAllactivitiesDtoResponse {
	
    private Integer empCode;
    private String name;
    private String jobTitle;
    private String emailId;
    private String description;
    private LocalDate date;
	private String status;
	
	public Integer getEmpCode() {
		return empCode;
	}
	public void setEmpCode(Integer empCode) {
		this.empCode = empCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
