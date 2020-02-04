package com.demo.service;

import java.util.List;
import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;
import com.demo.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService{
	
	CustomerRepository customerRepository =new HibernateCustomerRepositoryImpl();
	public List<Customer> findAll(){
		return customerRepository.findAll();		
	}

}
