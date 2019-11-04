package com.example.heroku_spring.repository;

import java.util.List;

import com.example.heroku_spring.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

}