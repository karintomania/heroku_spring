package com.example.heroku_spring.repository;

import java.util.List;

import com.example.heroku_spring.entity.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

	Customer findById(long id);
}