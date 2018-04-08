package com.devnp.springbootconfigurationpropertiesdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.devnp.springbootconfigurationpropertiesdemo.properties.HelloProperties;
import com.devnp.springbootconfigurationpropertiesdemo.properties.HelloYaml;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigurationpropertiesDemoApplicationTests {

	@Autowired
	private HelloProperties helloProperties ;
	
	@Autowired
	private HelloYaml helloYaml ;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testProperties() {
		System.out.println("This is from hello.properties file.");
		
		System.out.println(helloProperties.getMsg());
		
		System.out.println(helloProperties.getStudent());
		
		helloProperties.getBook().stream().forEach( book -> System.out.println(book));
	}
	
	@Test
	public void testYaml() {
		
		System.out.println("This is from hello.yaml file.");
		
		System.out.println(helloYaml.getMsg());
		
		System.out.println(helloYaml.getStudent());
		
		helloYaml.getBook().stream().forEach( book -> System.out.println(book));
	}
	

}
