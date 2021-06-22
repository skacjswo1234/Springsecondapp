package com.cos.secondapp;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 주소요청을 하는것
// http://localhost:8000
@RestController 
public class TestController {

	// http://localhost:8000/
	@GetMapping("/")
	public String get() {
		return"get";
	}
	
	// http://localhost:8000/
	@PostMapping("/")
		public String post(String name, String password) {
		System.out.println(name);
		System.out.println(password);
		return"post";
	}
	// http://localhost:8000/
	@PutMapping("/")
	public String put(String data) {
			System.out.println(data);
		return"put";
	}
	// http://localhost:8000/
	@DeleteMapping("/")
	public String delete() {
		return"delete";
	}
}
