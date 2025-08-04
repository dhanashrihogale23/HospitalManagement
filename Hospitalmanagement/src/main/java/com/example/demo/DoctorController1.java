package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController1 {
	
		@PostMapping("adddoctor1")
		String adddoctor1(@RequestBody doctor1 dr1) {
			
			doctor1Service ds = new doctor1Service();
			return ds.adddoctor1InDB(dr1);
		}

	}

class doctor1Service{
		
    String adddoctor1InDB(doctor1 dr1) {
	  if(dr1.getExperience() < 3) {
		  
		return "not elligible to do surgery";
	  }
	  return "added";
	 }
	}



