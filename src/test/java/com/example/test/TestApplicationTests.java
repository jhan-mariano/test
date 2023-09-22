package com.example.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class TestApplicationTests {

	@Autowired
	private TestController testController;

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		assertThat(testController).isNotNull();
	}

	@Test
	public void shouldReturnOk() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/test"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

}
