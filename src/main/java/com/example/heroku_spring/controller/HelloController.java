package com.example.heroku_spring.controller;

import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import com.example.heroku_spring.entity.Customer;
import com.example.heroku_spring.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@Autowired CustomerRepository cr;

	@RequestMapping("/")
    public ModelAndView index() {
		ModelAndView mav = new ModelAndView();

		List<Customer> customerList = cr.findAll();
		
		mav.addObject("customerList", customerList);
		mav.setViewName("customerList");
        return mav;
	}
}
