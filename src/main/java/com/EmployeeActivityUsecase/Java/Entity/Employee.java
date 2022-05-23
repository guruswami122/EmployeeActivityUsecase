package com.EmployeeActivityUsecase.Java.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
  //@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,  fetch = FetchType.EAGER)
	
	private Integer empId;
	private Integer empcode;
	private String empname;
	
	private String jobTitle;
	private String emailID;
	private Integer experience;
	private Long phoneNumber;
	private String location;
	private String project_status;
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,  fetch = FetchType.EAGER)
	private List<Activity> activities=new ArrayList<Activity>();
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
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
	public Integer getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getProject_status() {
		return project_status;
	}
	public void setProject_status(String project_status) {
		this.project_status = project_status;
	}
	
	public List<Activity> getActivities() {
		return activities;
	}
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
}
