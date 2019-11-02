package com.example.heroku_spring.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.heroku_spring.entity.Customer;
import com.example.heroku_spring.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@Autowired CustomerRepository cr;

	@RequestMapping("/")
    public ModelAndView index() {
		ModelAndView mav = new ModelAndView();

		Iterable<Customer> customerList = cr.findAll();
		mav.addObject("customerList", customerList);
		mav.setViewName("customerList");
        return mav;
	}
	

	

    // @RequestMapping("/")
    // public String index() {
	// 	return "Hello";
	// }

}
