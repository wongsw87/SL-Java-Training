package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // annotation '@' - not a POJO, another way to do configuration
                // subset of an alliance component which is auto-detected
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	// define a GreetingComponent variable without initialization
	private GreetingComponent g;
	
	// inject or create GreetingComponent object in the constructor; runtime injection
	@Autowired
	public GreetingController(GreetingComponent gc) {
		this.g = gc;
	}
	
	@GetMapping("/hello") // annotation '@' - tell Java runtime to accept the Get request n handle it
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	// test the GreetingComponent object
	@GetMapping("/testgreeting")
	public ResponseEntity<String> getMessage() {
		return ResponseEntity.ok(g.getMessage());	
	}
	
}