package com.EmployeeActivityUsecase.Java.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeActivityUsecase.Java.Dto.ActivityRequestDto;
import com.EmployeeActivityUsecase.Java.Dto.ActivityResponseDto;
import com.EmployeeActivityUsecase.Java.Dto.GetAllactivitiesDtoRequest;
import com.EmployeeActivityUsecase.Java.Dto.GetAllactivitiesDtoResponse;
import com.EmployeeActivityUsecase.Java.Entity.Activity;
import com.EmployeeActivityUsecase.Java.Service.ActivityService;


@RestController
@Validated
public class ActivityController {
	
	@Autowired
	ActivityService activityService;
	
	@PostMapping("/addactivity")
	public ResponseEntity<String> addDailyActivity(@RequestBody ActivityRequestDto activityRequestDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(activityService.addDailyActivity(activityRequestDto));
	}
	/*
	 * @GetMapping("/fetchallactivities") public
	 * ResponseEntity<List<ActivityRequestDto>> getAllActivities() { return
	 * ResponseEntity.status(HttpStatus.OK).body(activityService.getAllActivities())
	 * ; }
	 */
	@GetMapping("/viewDailyActivitywithcode/{empcode}")
	public ResponseEntity<List<ActivityResponseDto>> viewDailyActivitywithcode(@PathVariable Integer empcode) {
		return ResponseEntity.status(HttpStatus.OK).body(activityService.viewDailyActivitywithcode(empcode));
		
	}
	@PutMapping("/editDailyActivity")
	public ResponseEntity<String> editDailyActivity(@RequestBody ActivityRequestDto activityRequestDto) {
		return ResponseEntity.status(HttpStatus.OK).body(activityService.editDailyActivity(activityRequestDto));
	}
	
	/*
	 * @GetMapping("/getDailyActivitiesFromDateAndToDate") public
	 * ResponseEntity<List<GetAllactivitiesDtoResponse>>
	 * viewDailyActivities(@RequestBody GetAllactivitiesDtoRequest
	 * getAllactivitiesDtoRequest){ return
	 * ResponseEntity.status(HttpStatus.OK).body(activityService.viewDailyActivities
	 * (getAllactivitiesDtoRequest)); }
	 * 
	 * @GetMapping("/byDate/{date}") public
	 * ResponseEntity<List<GetAllactivitiesDtoResponse>>
	 * viewDailyActivity(@PathVariable LocalDate date){ return
	 * ResponseEntity.status(HttpStatus.OK).body(activityService.viewDailyActivity(
	 * date)); }
	 */
}
