package com.demo.repository;

import java.util.List;
import com.demo.model.Customer;

public interface CustomerRepository {
	
	public List<Customer> findAll();

}
