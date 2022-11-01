package com.mmtest.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class TestController {

	@GetMapping("/hello")
	public String getValue() {
		String result = "Hello World";
		return result;
	}
}
