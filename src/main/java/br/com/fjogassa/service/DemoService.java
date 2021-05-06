package br.com.fjogassa.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DemoService {

	public String getMessage() {
		return "Hello World";
	}
	
}
