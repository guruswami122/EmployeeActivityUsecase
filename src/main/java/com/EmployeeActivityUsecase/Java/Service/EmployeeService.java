package com.EmployeeActivityUsecase.Java.Service;

import java.util.List;

import com.EmployeeActivityUsecase.Java.Dto.EmployeeRequestDto;
import com.EmployeeActivityUsecase.Java.Entity.Employee;



public interface EmployeeService {
	public String addEmployee(EmployeeRequestDto employeeRequestDto);
	public List<EmployeeRequestDto> getAllEmployee();
	public EmployeeRequestDto getEmployeeById(Integer empID);
	public String updateEmployeeDetails(Integer empid,EmployeeRequestDto employeeRequestDto);
	public void deleteEmployee(Integer empId);

}
