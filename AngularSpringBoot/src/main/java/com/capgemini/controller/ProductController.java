package com.capgemini.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.beans.Product;
import com.capgemini.repository.ProductRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {

	@Autowired
	ProductRepository employeerepository;

	// get all products 
	@GetMapping("/products")
	public List<Product> getAllEmployees() {
		return employeerepository.findAll();
	}

	// Get a single product based on the id
	@GetMapping("/employees/{id}")
	public Product getEmployeeById(@PathVariable(value = "id") int id) {
		Optional<Product> emp = employeerepository.findById(id);

		return emp.get();
	}

	// Create a new product
	@PostMapping("/products")
	public Product createProduct(@Valid @RequestBody Product product) {
		return employeerepository.save(product);
	}


	// Delete a Product
	@DeleteMapping("/employees/{id}")
	public void deleteNote(@PathVariable(value = "id") int id) {
		Optional<Product> emp = employeerepository.findById(id);
		Product product = emp.get();

		employeerepository.delete(product);
	}

	

}
