package com.test.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FallbackController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallBack() {
		return "userService isDown ,Please try again later";
	}
	
	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallBack() {
		return "departmentService is Down ,Please try again later";
	}

}
