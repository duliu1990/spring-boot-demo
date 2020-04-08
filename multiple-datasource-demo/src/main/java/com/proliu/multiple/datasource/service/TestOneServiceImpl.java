package com.proliu.multiple.datasource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional("testOneTxManager")
@Service
public class TestOneServiceImpl implements TestOneService {

	@Autowired
	private JdbcTemplate jdbcTemplateOne;
	
	@Autowired
	private TestTwoService testTwoService;
	
	@Override
	public void savePerson() {
		// TODO Auto-generated method stub
		this.jdbcTemplateOne.update("insert into Person(name) values(?)", "test02");
		this.testTwoService.savePerson();
		throw new RuntimeException("This is test error");
	}

}
