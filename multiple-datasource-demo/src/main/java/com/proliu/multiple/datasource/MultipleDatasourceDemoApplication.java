package com.proliu.multiple.datasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class, JdbcTemplateAutoConfiguration.class })
public class MultipleDatasourceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleDatasourceDemoApplication.class, args);
	}

}
