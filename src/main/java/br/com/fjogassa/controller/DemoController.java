package br.com.fjogassa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fjogassa.service.DemoService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/demo-controller")
@AllArgsConstructor
public class DemoController {
	
	private DemoService demoService;
	
	@GetMapping("/hello-world")
	public String getMessage() {
		return demoService.getMessage();
	}
	
}
