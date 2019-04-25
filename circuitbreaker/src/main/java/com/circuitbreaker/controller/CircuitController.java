package com.circuitbreaker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.circuitbreaker.service.CircuitService;

/**
 * The Class CircuitController.
 */
@RestController
@RequestMapping(value="/circuit")
@EnableCircuitBreaker
@EnableHystrixDashboard
public class CircuitController {

	/** The cs. */
	@Autowired
	CircuitService cs;
	
	/**
	 * List books.
	 *
	 * @return the list
	 */
	@GetMapping("/list-of-books")
	public List<String> listBooks(){
		return cs.listBooks();
	}
}
