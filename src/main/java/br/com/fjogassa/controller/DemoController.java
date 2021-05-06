package br.com.fjogassa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fjogassa.service.DemoService;

@RestController
@RequestMapping("/api/demo-controller")
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@GetMapping("/hello-world")
	public String getMessage() {
		return demoService.getMessage();
	}
	
}
