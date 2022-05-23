package com.EmployeeActivityUsecase.Java.Service;

import java.time.LocalDate;
import java.util.List;

import com.EmployeeActivityUsecase.Java.Dto.ActivityRequestDto;
import com.EmployeeActivityUsecase.Java.Dto.ActivityResponseDto;
import com.EmployeeActivityUsecase.Java.Dto.GetAllactivitiesDtoRequest;
import com.EmployeeActivityUsecase.Java.Dto.GetAllactivitiesDtoResponse;
import com.EmployeeActivityUsecase.Java.Entity.Activity;

public interface ActivityService {
	public String addDailyActivity(ActivityRequestDto activityRequestDto);
	//public List<ActivityRequestDto> getAllActivities();
	public List<ActivityResponseDto> viewDailyActivitywithcode(Integer empcode);
	public String editDailyActivity(ActivityRequestDto activityRequestDto);
	
	/*
	 * public List<GetAllactivitiesDtoResponse>
	 * viewDailyActivities(GetAllactivitiesDtoRequest getAllactivitiesDtoRequest);
	 * public List<GetAllactivitiesDtoResponse> viewDailyActivity(LocalDate date);
	 */
}
