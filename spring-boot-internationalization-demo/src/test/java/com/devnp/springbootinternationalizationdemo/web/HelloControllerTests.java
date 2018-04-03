/**
 * 
 */
package com.devnp.springbootinternationalizationdemo.web;

import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author duliu
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTests {
	
	@Autowired
	private WebApplicationContext context;
	
	private MockMvc mvc;

	@Before
	public void before() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	@Test
	public void testIndex() throws UnsupportedEncodingException, Exception {
		String enResult = this.mvc.perform(MockMvcRequestBuilders.post("/hello?language=en_US"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse().getContentAsString();
		
		String zhResult = this.mvc.perform(MockMvcRequestBuilders.post("/hello?language=zh_CN"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse().getContentAsString();

		System.out.println("enResult : " + enResult);
		System.out.println("zhResult : " + zhResult);
	}
}
