package com.Aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {
	@GetMapping(value="/get")
	public String get() {
		return "Aws Task is Done";
	}

}
