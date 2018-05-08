/**
 * 
 */
package com.devnp.springbootemaildemo.email;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.mail.MessagingException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;

/**
 * @author duliu
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplateMailSendTests {
	
	@Autowired
	private TemplateMailSend templateMailSend ;
	
	@Autowired
	private Map<String, TemplateEngine> templateEngine ;
	
	@Test
	public void testSendWithThymeleafHtmlTemplate() throws MessagingException {
		templateMailSend.sendWithThymeleafHtmlTemplate("duliu1231@foxmail.com", "This is Thymeleaf Html Template Email", "mail/html/mail-hello", "duliu", "logo.png");
	}
	
	@Test
	public void testSendWithThymeleafTextTemplate() throws MessagingException {
		templateMailSend.sendWithThymeleafTextTemplate("duliu1231@foxmail.com", "This is Thymeleaf Text Template Email", "mail/text/mail-hello", "duliu");
		
		for (Entry<String, TemplateEngine> iterable : templateEngine.entrySet()) {
			System.out.println(iterable.getKey() + "| " + iterable.getValue());
		}
	}

}
