package com.cos.secondapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 주소요청을 하는것
// http://localhost:8000
@RestController 
public class TestController {

	// http://localhost:8000/test1
	@GetMapping("/test1")
	public String test1() {
		return"test1 ok";
	}
	
	// http://localhost:8000/test2
	@GetMapping("/test2")
	public String test2() {
		return"test2 ok";
	}
}
