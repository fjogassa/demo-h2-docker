package br.com.fjogassa.controller;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import br.com.fjogassa.service.DemoService;

@WebMvcTest(controllers = DemoController.class)
public class DemoControllerTest {

	@MockBean
	private DemoService demoService;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getHelloWorld() throws Exception {
		when(demoService.getMessage()).thenReturn("TESTE CONTROLLER");
		
		this.mockMvc
				.perform(get("/api/demo-controller/hello-world")
						.accept(MediaType.APPLICATION_JSON)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", equalTo("TESTE CONTROLLER")));
		
		verify(demoService).getMessage();
		verifyNoMoreInteractions(demoService);
	}
}