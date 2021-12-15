package com.example.log;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// promote java class to become a rest controller (service) and not a POJO/regular class anymore

@RestController
public class TestLog {

	private static final Logger logger = LogManager.getLogger(TestLog.class);
	
	@GetMapping("/test")
	public void test() {
	  logger.atLevel(Level.WARN);
	  
	  logger.trace("Trace Message!");
	  logger.debug("Debug Message!");
	  logger.info("Info Message!");
	  logger.warn("Warn Message!");
	  logger.error("Error Message!");
	  logger.fatal("Fatal Message!"); // FATAL - nothing can be done to fix the error
  }
}
