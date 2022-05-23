package com.EmployeeActivityUsecase.Java.Dto;

import java.sql.Date;

public class ActivityRequestDto {
	   
	private Integer empCode;
	//private Date activityDate;
	private String description;
	private String status;

	   
	public Integer getEmpCode() {
			return empCode;
	}
		public void setEmpCode(Integer empCode) {
			this.empCode = empCode;
		}

		/*
		 * public Date getActivityDate() { return activityDate; } public void
		 * setActivityDate(Date activityDate) { this.activityDate = activityDate; }
		 */
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
