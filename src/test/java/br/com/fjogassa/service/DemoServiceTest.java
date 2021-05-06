package br.com.fjogassa.service;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class DemoServiceTest {
	
	private DemoService demoService;	
	
	@Test
	void getMessage() {
		String mensagem = demoService.getMessage();
		
		assertThat(mensagem, equalTo("Hello World"));
	}

}
