package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;
import com.demo.repository.HibernateCustomerRepositoryImpl;

@Service("customerService")
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	public List<Customer> findAll(){
		return customerRepository.findAll();		
	}

}
