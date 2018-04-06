/**
 * 
 */
package com.devnp.springbootexceptionhandlerdemo.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author duliu
 *
 */
@Configuration
public class CustomConfig extends WebMvcConfigurerAdapter{

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {

		return (container -> {
			ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404");
			ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500");

			container.addErrorPages(error404Page, error500Page);
		});
	}
}
