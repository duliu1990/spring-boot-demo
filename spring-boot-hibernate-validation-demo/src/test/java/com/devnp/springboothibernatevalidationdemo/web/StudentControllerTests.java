/**
 * 
 */
package com.devnp.springboothibernatevalidationdemo.web;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
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
public class StudentControllerTests {

	@Autowired
	private WebApplicationContext context;
	
	private MockMvc mvc;

	@Before
	public void before() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	@Test
	public void testAdd() throws Exception {

		Date date = new Date();

		String enResult = this.mvc
				.perform(MockMvcRequestBuilders.post("/student/add?lang=en_US").contentType(MediaType.APPLICATION_JSON_UTF8)
						.content("{\"stuName\":\"jack\",\"stuAge\":null, \"stuBirth\":\"" + date.getTime() + "\"}"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse().getContentAsString();

		System.out.println("Result : " + enResult);
		
		String zhResult = this.mvc
				.perform(MockMvcRequestBuilders.post("/student/add?lang=zh_CN").contentType(MediaType.APPLICATION_JSON_UTF8)
						.content("{\"stuName\":\"Tom\",\"stuAge\":12, \"stuBirth\":\"" + date.getTime() + "\"}"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse().getContentAsString();

		System.out.println("结果 : " + zhResult);
	}
	
}
