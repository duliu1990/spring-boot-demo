package com.proliu.multiple.datasource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional("testTwoTxManager")
@Service
public class TestTwoServiceImpl implements TestTwoService {

	@Autowired
	private JdbcTemplate jdbcTemplateTwo;

	@Override
	public void savePerson() {
		// TODO Auto-generated method stub
		this.jdbcTemplateTwo.update("insert into Person(age) values(?)", 29);
	}

}
