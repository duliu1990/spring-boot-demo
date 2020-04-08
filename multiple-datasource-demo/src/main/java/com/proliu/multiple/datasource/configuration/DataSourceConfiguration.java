package com.proliu.multiple.datasource.configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class DataSourceConfiguration {

	/**
	 * Test One Connection to Database test01
	 */
	@Bean
	@ConfigurationProperties("test01.datasource")
	public DataSourceProperties testOneDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean
	public DataSource testOneDataSource() {
		DataSourceProperties dataSourceProperties = testOneDataSourceProperties();
		return dataSourceProperties.initializeDataSourceBuilder().build();
	}

	@Bean
	@Resource
	public PlatformTransactionManager testOneTxManager(DataSource testOneDataSource) {
		return new DataSourceTransactionManager(testOneDataSource);
	}
	
	@Bean
	public JdbcTemplate jdbcTemplateOne() {
		return new JdbcTemplate(testOneDataSource());
	}

	/**
	 * Test Two
	 * 
	 * Connection to Database test02
	 */
	@Bean
	@ConfigurationProperties("test02.datasource")
	public DataSourceProperties testTwoDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean
	public DataSource testTwoDataSource() {
		DataSourceProperties dataSourceProperties = testTwoDataSourceProperties();
		return dataSourceProperties.initializeDataSourceBuilder().build();
	}

	@Bean
	@Resource
	public PlatformTransactionManager testTwoTxManager(DataSource testTwoDataSource) {
		return new DataSourceTransactionManager(testTwoDataSource);
	}
	
	@Bean
	public JdbcTemplate jdbcTemplateTwo() {
		return new JdbcTemplate(testTwoDataSource());
	}
	
	
}
