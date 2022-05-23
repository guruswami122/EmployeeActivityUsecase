package com.EmployeeActivityUsecase.Java.Dto;

import java.sql.Date;
import java.time.LocalDate;

public class ActivityResponseDto {
	

	private LocalDate activityDate;
	private String description;
	private String status;
	private Integer empcode;
	private String empname;
	private String jobTitle;
	private String emailID;
	
	public Integer getEmpcode() {
		return empcode;
	}
	public void setEmpcode(Integer empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	  
	
	public LocalDate getActivityDate() {
		return activityDate;
	}
	public void setActivityDate(LocalDate activityDate) {
		this.activityDate = activityDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
