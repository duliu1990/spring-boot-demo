/**
 * 
 */
package com.devnp.springbootsecurityformlogindemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author duliu
 * 
 * Spring  Security 配置
 * 
 */
@Configuration
public class SecurityFormLoginConfig extends WebSecurityConfigurerAdapter{
	
	/**
	 * 配置密码处理，对用户密码进行加密，验证
	 * @return
	 */
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.formLogin()
			.loginPage("/")
			.loginProcessingUrl("/login")
			//.successForwardUrl("")
			//.successHandler(null)
			.and()
			.authorizeRequests().antMatchers("/").permitAll()
			.and()
			.authorizeRequests()
			.anyRequest().authenticated()
			.and()
			.csrf().disable();
	}

}