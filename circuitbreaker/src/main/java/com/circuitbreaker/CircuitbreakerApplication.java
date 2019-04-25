package com.circuitbreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Class CircuitbreakerApplication.
 */
@SpringBootApplication
public class CircuitbreakerApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(CircuitbreakerApplication.class, args);
	}

	//This has been added for Hystrix-Dashboard
	/*
	 * @Bean public ServletRegistrationBean hystrixMetricsStreamServlet() {
	 * ServletRegistrationBean registration = new ServletRegistrationBean(new
	 * HystrixMetricsStreamServlet());
	 * registration.addUrlMappings("/hystrix.stream"); return registration; }
	 */
}
