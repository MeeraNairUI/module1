package com.patientservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/patient")
public class PatientController{
	@Autowired
	RestTemplate template;
	
	@GetMapping("/retrieve")
	public List<DoctorServiceEntity> patient (){
		String url="http://localhost:8090/doctor/create";
		String url1="http://localhost:8090/doctor/retrievebyid";
		String url2="http://localhost:8090/doctor/retrievebyname";
		List output1=template.getForObject(url1, List.class);
		List output2=template.getForObject(url2, List.class);
		return output1;
		return output2;
	}
	
}