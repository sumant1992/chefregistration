package com.registration.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.registration.demo.models.Registration;
import com.registration.demo.repo.ModelRepo;

@RestController
public class HomeController 
{
	@Autowired
	private ModelRepo repo;
	
	
	  @GetMapping("/")
	    public String welcome() {
			return "welcome user";
	    	
	    }
	  
	  @PostMapping("/add")
	  public Registration addUser(@RequestBody Registration registration) {
		  return repo.save(registration);
	  }
	  
	  @GetMapping("/all")
	  public List<Registration> all(){
		  return repo.findAll();
	  }
	  
	  


}
