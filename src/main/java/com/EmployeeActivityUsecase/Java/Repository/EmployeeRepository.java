package com.EmployeeActivityUsecase.Java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeActivityUsecase.Java.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	Employee findByempId(Integer empId);
	Employee findByEmpcode(Integer empcode);
	
	

}
