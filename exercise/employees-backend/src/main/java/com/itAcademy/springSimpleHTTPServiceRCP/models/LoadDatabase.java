package com.itAcademy.springSimpleHTTPServiceRCP.models;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itAcademy.springSimpleHTTPServiceRCP.repositories.EmployeeRepository;

@Configuration
public class LoadDatabase 
{
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) 
	{
		return args -> 
		{
			System.out.println("Preloading Data to memoryDatabase");
			//data could be loaded
			System.out.println("Data loaded");
		};
	}

}
