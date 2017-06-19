package com.example.demo.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoControllerTest {

	
	// ---- Begin mockMvc setup
	// These next lines are just to setup the mockMvc which is used to make our HTTP calls
	private MockMvc mockMvc;
	
	@Autowired
    private WebApplicationContext wac;

	@Before
	public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	// ----- END mockMvc setup
	
	/**
	 * Test a simple call to a REST controller that responds with plain text (note JSON).  We use 
	 * Matchers to validate we get the expected return.
	 * @throws Exception
	 */
	@Test
	public void whenGetHelloExpectHello() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.TEXT_HTML))
        .andExpect(content().string(Matchers.containsString("Hello World")));
	}

	/**
	 * Test a simple call to a REST controller.  Note the $ below references the root of the JSON response object.
	 * @throws Exception
	 */
	@Test
	public void whenGetJsonHelloExpectJsonHello() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hellojson").accept(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.name").value("Hello World"))
		.andExpect(jsonPath("$.count").value(5));
	}
}