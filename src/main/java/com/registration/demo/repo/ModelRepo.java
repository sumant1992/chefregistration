package com.registration.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.demo.models.Registration;

public interface ModelRepo extends JpaRepository<Registration, Integer>{

}
