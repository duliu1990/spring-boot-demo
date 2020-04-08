package com.proliu.multiple.datasource.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestOneServiceTests {
	
	@Autowired
	private TestOneService testOneService;

	@Test
	void testSavePerson() {
		this.testOneService.savePerson();;
	}
}
