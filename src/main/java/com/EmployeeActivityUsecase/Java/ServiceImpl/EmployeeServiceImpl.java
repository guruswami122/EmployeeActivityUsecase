package com.EmployeeActivityUsecase.Java.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeActivityUsecase.Java.Dto.EmployeeRequestDto;
import com.EmployeeActivityUsecase.Java.Entity.Activity;
import com.EmployeeActivityUsecase.Java.Entity.Employee;
import com.EmployeeActivityUsecase.Java.Repository.EmployeeRepository;
import com.EmployeeActivityUsecase.Java.Service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeReposity;
	
	//Add the Employee
	
	public String addEmployee(EmployeeRequestDto employeeRequestDto) {
		Employee empobj=new Employee();
		empobj.setEmpcode(employeeRequestDto.getEmpcode());
		empobj.setEmailID(employeeRequestDto.getEmailID());
		empobj.setJobTitle(employeeRequestDto.getJobTitle());
		empobj.setEmpname(employeeRequestDto.getEmpname());
		empobj.setExperience(employeeRequestDto.getExperience());
		empobj.setLocation(employeeRequestDto.getLocation());
		empobj.setPhoneNumber(employeeRequestDto.getPhoneNumber());
		empobj.setProject_status(employeeRequestDto.getProject_status());
		employeeReposity.save(empobj);
		return "Employee Details saved Sucessfully";
		
		
	}
	
	//List of All Employees
	
	public List<EmployeeRequestDto> getAllEmployee(){
		return employeeReposity.findAll().stream().map(emp ->{
		 EmployeeRequestDto employeeRequestDto=new EmployeeRequestDto();
		 employeeRequestDto.setEmailID(emp.getEmailID());
		 employeeRequestDto.setEmpcode(emp.getEmpcode());
		 employeeRequestDto.setEmpname(emp.getEmpname());
		 employeeRequestDto.setExperience(emp.getExperience());
		 employeeRequestDto.setJobTitle(emp.getJobTitle());
		 employeeRequestDto.setLocation(emp.getLocation());
		 employeeRequestDto.setPhoneNumber(emp.getPhoneNumber());
		 employeeRequestDto.setProject_status(emp.getProject_status());
		 return employeeRequestDto;
		}).toList();
		
		 
				
				
				
	}
	
	//List of Single Employee
	@Override
	public EmployeeRequestDto getEmployeeById(Integer empID) {
		// TODO Auto-generated method stub
		return employeeReposity.findById(empID).map(emp ->{
			EmployeeRequestDto employeeRequestDto=new EmployeeRequestDto();
			 employeeRequestDto.setEmailID(emp.getEmailID());
			 employeeRequestDto.setEmpcode(emp.getEmpcode());
			 employeeRequestDto.setEmpname(emp.getEmpname());
			 employeeRequestDto.setExperience(emp.getExperience());
			 employeeRequestDto.setJobTitle(emp.getJobTitle());
			 employeeRequestDto.setLocation(emp.getLocation());
			 employeeRequestDto.setPhoneNumber(emp.getPhoneNumber());
			 employeeRequestDto.setProject_status(emp.getProject_status());
			 return employeeRequestDto;	
			}).get();
		
	}
	
	//Delete an Employee
	@Override
	public void deleteEmployee(Integer empId) {
		// TODO Auto-generated method stub
		employeeReposity.deleteById(empId);
		
	}
	
	//Update an Employee
	
	public String updateEmployeeDetails(Integer empid,EmployeeRequestDto employeeRequestDto) {
		Employee employee=employeeReposity.findByempId(empid);
		employee.setEmailID(employeeRequestDto.getEmailID());
		employeeReposity.save(employee);
		return "Employee details edited sucessfully";
		
	}
	}
	


