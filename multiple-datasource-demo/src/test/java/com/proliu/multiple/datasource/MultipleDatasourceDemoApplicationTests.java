package com.proliu.multiple.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class MultipleDatasourceDemoApplicationTests {

	@Autowired
	private JdbcTemplate jdbcTemplateOne;

	@Autowired
	private JdbcTemplate jdbcTemplateTwo;

	@Test
	void testDatasourceOne() {
		this.jdbcTemplateOne.update("insert into Person(name) values(?)", "test01");
	}

	@Test
	void testDatasourceTwo() {
		this.jdbcTemplateTwo.update("insert into Person(age) values(?)", 30);
	}

}
