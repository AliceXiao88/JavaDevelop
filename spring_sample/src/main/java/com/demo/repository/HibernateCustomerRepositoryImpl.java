package com.demo.repository;

import java.util.ArrayList;
import java.util.List;
import com.demo.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository{
	
	public List<Customer> findAll(){
		List<Customer> customers= new ArrayList<Customer>();
		Customer customer= new Customer();
		
		customer.setId(10);
		customer.setName("John Smith");
		
		customers.add(customer);
		return customers;
		
	}

}
