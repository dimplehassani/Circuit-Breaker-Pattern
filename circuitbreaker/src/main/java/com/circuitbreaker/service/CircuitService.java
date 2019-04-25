package com.circuitbreaker.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * The Class CircuitService.
 */
@Service
public class CircuitService {

	/**
	 * List books.
	 *
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	@HystrixCommand(fallbackMethod = "reliable")
	public List<String> listBooks() {
		RestTemplate restTemplate = new RestTemplate();
		List<String> books;

		URI uri = URI.create("http://localhost:8080/bookstore/list-of-books");
		books = restTemplate.getForObject(uri, List.class);
		return books;
	}

	/**
	 * Reliable.
	 *
	 * @return the list
	 */
	public List<String> reliable() {
		List<String> list = new ArrayList<String>();
		list.add("The Site is currently down, Sorry for the inconvenience!");
		return list;
	}
}
