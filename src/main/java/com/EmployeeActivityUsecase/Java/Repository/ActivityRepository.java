package com.EmployeeActivityUsecase.Java.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeActivityUsecase.Java.Entity.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
	Activity findByActivityId(Integer activityId);
	List<Activity> findByEmployeeEmpcode(Integer empcode);
	Activity findByDescription(String description);
	
	//List<Activity> findByDateBetween(LocalDate fromDate, LocalDate toDate);
	//List<Activity> findByDate(LocalDate date);
	

}
