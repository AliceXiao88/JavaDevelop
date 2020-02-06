package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.demo.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository{
	@Value("${db.username}")
	private String username;
	
	
	public List<Customer> findAll(){
		
		System.out.println("From Props: " + username);
		List<Customer> customers= new ArrayList<Customer>();
		Customer customer= new Customer();
		
		customer.setId(10);
		customer.setName("John Smith");
		
		customers.add(customer);
		return customers;
		
	}

}
