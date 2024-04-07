package com.tns.customerservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerRepository repo;
	
	//Get all the records from the table
	public void insertRecord(Customer customer)
	{
		repo.save(customer);
	}
	
	//Show all the records from the table in database
	public List<Customer> getAllRecords()
	{
		return repo.findAll();
	}
	
	//Show specific record from the table in database
	public Customer getCustomerById(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//Deleting the specific record from the table in database
	public void deleteCustomer(Integer id)
	{
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void updateCustomer(Integer id,Customer updateCustomer)
	{
		Customer existingCustomer=repo.findById(id).orElse(null);
		if(existingCustomer!=null)
		{
			existingCustomer.setCustomerid(updateCustomer.getCustomerid());
			existingCustomer.setCustomername(updateCustomer.getCustomername());
			existingCustomer.setAddress(updateCustomer.getAddress());
			existingCustomer.setEmail(updateCustomer.getEmail());
			existingCustomer.setPassword(updateCustomer.getPassword());
			existingCustomer.setSalary(updateCustomer.getSalary());
			repo.save(existingCustomer);
		}
	}

}
