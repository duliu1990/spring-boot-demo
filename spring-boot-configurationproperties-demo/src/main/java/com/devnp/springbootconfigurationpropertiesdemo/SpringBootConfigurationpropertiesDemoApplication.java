package com.devnp.springbootconfigurationpropertiesdemo;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class SpringBootConfigurationpropertiesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigurationpropertiesDemoApplication.class, args);
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
	  PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
	  YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
	  yaml.setResources(new ClassPathResource("hello.yaml"));
	  propertySourcesPlaceholderConfigurer.setProperties(yaml.getObject());
	  return propertySourcesPlaceholderConfigurer;
	}
}
