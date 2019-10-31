package com.example.heroku_spring.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.heroku_spring.entity.Customer;
import com.example.heroku_spring.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Autowired CustomerRepository cr;

    @RequestMapping("/")
    public String index() {
		String result = "";

		Customer cstm = new Customer("aaa", "first");
		cr.save(cstm);

		Iterable<Customer> cstmList = cr.findAll();
		for(Customer c: cstmList){
			result += Long.toString(c.getId());
			result += "; ";
		}
        return "Hello"+result+"!!";
	}
	

	

    // @RequestMapping("/")
    // public String index() {
	// 	return "Hello";
	// }

}
