package com.EmployeeActivityUsecase.Java.ServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeActivityUsecase.Java.Dto.ActivityRequestDto;
import com.EmployeeActivityUsecase.Java.Dto.ActivityResponseDto;
import com.EmployeeActivityUsecase.Java.Dto.GetAllactivitiesDtoRequest;
import com.EmployeeActivityUsecase.Java.Dto.GetAllactivitiesDtoResponse;
import com.EmployeeActivityUsecase.Java.Entity.Activity;
import com.EmployeeActivityUsecase.Java.Entity.Employee;
import com.EmployeeActivityUsecase.Java.Repository.ActivityRepository;
import com.EmployeeActivityUsecase.Java.Repository.EmployeeRepository;
import com.EmployeeActivityUsecase.Java.Service.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService{
	
    @Autowired
	ActivityRepository activityRepository;
    @Autowired
    EmployeeRepository employeeRepository;
	
	
	
	public String addDailyActivity(ActivityRequestDto activityRequestDto) {
		// TODO Auto-generated method stub
		Activity activity=new Activity();
		activity.setDescription(activityRequestDto.getDescription());
		activity.setStatus(activityRequestDto.getStatus());
		activity.setActivityDate(LocalDate.now());
		Employee employee=employeeRepository.findByEmpcode(activityRequestDto.getEmpCode());
	    activity.setEmployee(employee);
		activityRepository.save(activity);
		return "Activity Details saved sucessfully";
	}



	@Override
	public List<ActivityResponseDto> viewDailyActivitywithcode(Integer empcode) {
		// TODO Auto-generated method stub
		List<Activity> activities=activityRepository.findByEmployeeEmpcode(empcode);
		List<ActivityResponseDto> activityResponseDtos=new ArrayList<ActivityResponseDto>();
		
		for(Activity activity:activities) {
			ActivityResponseDto a=new ActivityResponseDto();
			a.setActivityDate(activity.getActivityDate());
			a.setDescription(activity.getDescription());
			a.setStatus(activity.getStatus());
			a.setEmailID(activity.getEmployee().getEmailID());
			a.setJobTitle(activity.getEmployee().getJobTitle());
			a.setEmpcode(empcode);
			a.setEmpname(activity.getEmployee().getEmpname());
			activityResponseDtos.add(a);
		}
		
      return activityResponseDtos;
	}




	public String editDailyActivity( ActivityRequestDto activityRequestDto) {
		// TODO Auto-generated method stub
		Activity activity=activityRepository.findByDescription(activityRequestDto.getDescription());
		activity.setStatus(activityRequestDto.getStatus());
		activity.setActivityDate(LocalDate.now());
		Employee employee=employeeRepository.findByEmpcode(activityRequestDto.getEmpCode());
	   // activity.setEmployee(employee);
	    activityRepository.save(activity);
		return "Activity Details edited sucessfully";
	}
   

	/*
	 * @Override public List<GetAllactivitiesDtoResponse>
	 * viewDailyActivities(GetAllactivitiesDtoRequest getAllactivitiesDtoRequest){
	 * 
	 * LocalDate fromDate=getAllactivitiesDtoRequest.getFromDate(); LocalDate
	 * toDate=getAllactivitiesDtoRequest.getToDate(); List<Activity>
	 * activities=activityRepository.findByDateBetween(fromDate, toDate);
	 * List<GetAllactivitiesDtoResponse> getAllactivitiesDtoResponse=new
	 * ArrayList<GetAllactivitiesDtoResponse>();
	 * 
	 * for(Activity activity:activities) { GetAllactivitiesDtoResponse a=new
	 * GetAllactivitiesDtoResponse(); a.setStatus(activity.getStatus());
	 * a.setDescription(activity.getDescription());
	 * a.setEmailId(activity.getEmployee().getEmailID());
	 * a.setJobTitle(activity.getEmployee().getJobTitle());
	 * a.setName(activity.getEmployee().getEmpname());
	 * a.setEmpCode(activity.getEmployee().getEmpcode());
	 * a.setDate(activity.getActivityDate()); getAllactivitiesDtoResponse.add(a);
	 * 
	 * } return getAllactivitiesDtoResponse; }
	 * 
	 * @Override public List<GetAllactivitiesDtoResponse>
	 * viewDailyActivity(LocalDate date){ List<Activity>
	 * activities=activityRepository.findByDate(date);
	 * List<GetAllactivitiesDtoResponse> getAllactivitiesDtoResponse=new
	 * ArrayList<GetAllactivitiesDtoResponse>();
	 * 
	 * for(Activity activity:activities) { GetAllactivitiesDtoResponse a=new
	 * GetAllactivitiesDtoResponse(); a.setStatus(activity.getStatus());
	 * a.setDescription(activity.getDescription());
	 * a.setEmailId(activity.getEmployee().getEmailID());
	 * a.setJobTitle(activity.getEmployee().getJobTitle());
	 * a.setName(activity.getEmployee().getEmpname());
	 * a.setEmpCode(activity.getEmployee().getEmpcode());
	 * a.setDate(activity.getActivityDate()); getAllactivitiesDtoResponse.add(a); }
	 * return getAllactivitiesDtoResponse; }
	 */
	}


