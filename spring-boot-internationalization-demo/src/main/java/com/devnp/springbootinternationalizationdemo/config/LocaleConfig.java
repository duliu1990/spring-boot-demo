/**
 * 
 */
package com.devnp.springbootinternationalizationdemo.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 * @author duliu
 *
 */
@Configuration
public class LocaleConfig extends WebMvcConfigurerAdapter{

	/**
	 * 配置默认语言
	 * @return
	 */
	@Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.US);
        
        return sessionLocaleResolver;
    }

	/**
	 * 注册一个“LocaleChangeInterceptor”拦截器并将其引用到任何需要支持多种语言的处理器映射。 “paramName”是用于设置语言环境的参数值。
	 * @return
	 */
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("language");
        
        return localeChangeInterceptor;
    }

    /**
     * 对拦截器进行注册
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }
}
