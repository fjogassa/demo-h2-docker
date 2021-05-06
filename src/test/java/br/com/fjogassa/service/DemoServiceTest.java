package br.com.fjogassa.service;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoServiceTest {
	
	private DemoService demoService;	
	
	@BeforeEach
	public void setUp() {
		demoService = new DemoService();
	}
	
	@Test
	public void getMessage() {
		String mensagem = demoService.getMessage();
		
		assertThat(mensagem, equalTo("Hello World"));
	}

}
