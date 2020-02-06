package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.demo.repository.CustomerRepository;
import com.demo.repository.HibernateCustomerRepositoryImpl;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.demo"})
@PropertySource("application.properties")

public class AppConfig {

	/*@Bean("customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service= new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository());
		
		return service;
	}
	*/
	
	/*@Bean("customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
	*/
}
