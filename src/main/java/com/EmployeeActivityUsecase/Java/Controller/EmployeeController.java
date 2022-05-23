package com.EmployeeActivityUsecase.Java.Controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeActivityUsecase.Java.Dto.ActivityRequestDto;
import com.EmployeeActivityUsecase.Java.Dto.EmployeeRequestDto;
import com.EmployeeActivityUsecase.Java.Entity.Employee;
import com.EmployeeActivityUsecase.Java.Repository.EmployeeRepository;
import com.EmployeeActivityUsecase.Java.Service.EmployeeService;



@RestController
@Validated
public class EmployeeController {
  
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/addemployee")
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeRequestDto employeeRequestDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.addEmployee(employeeRequestDto));
		
	}
	@GetMapping("/fetchallemployees")
	public ResponseEntity<List<EmployeeRequestDto>> getAllEmployee(){
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployee());
	}
	@GetMapping("/fetchemployee/{empID}")
	public ResponseEntity<EmployeeRequestDto> getEmployee(@PathVariable Integer empID) {
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployeeById(empID));
	}
	
	@PatchMapping("/editEmployee/{empid}")
	public ResponseEntity<String> updateEmployeeDetails(@PathVariable  Integer empid,@RequestBody EmployeeRequestDto employeeRequestDto) {
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.updateEmployeeDetails(empid,employeeRequestDto));
	}
}
