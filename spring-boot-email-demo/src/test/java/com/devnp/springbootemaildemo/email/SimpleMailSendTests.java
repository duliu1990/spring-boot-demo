package com.devnp.springbootemaildemo.email;

import java.util.Arrays;

import javax.mail.MessagingException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleMailSendTests {

	@Autowired
	private SimpleMailSend simpleMailSend;
	
	@Test
	public void testSimpleSend() {
		simpleMailSend.simpleSend("duliu1231@foxmail.com", "Hello E-Mail", "Hi,\n\nThis is test email.");
	}
	
	@Test
	public void testSimpleSend2() {
		String [] toMails = {"duliu1231@foxmail.com"};
		String [] ccMails = {"duliu1990@gmail.com"};
		String [] bccMails = {"492062702@qq.com"};
		
		simpleMailSend.simpleSend(toMails, ccMails, bccMails, "这是一封邮件", "你好,\n\n这个是一个多人的邮件。");
	}
	
	@Test
	public void testSendWithHtml() {
		simpleMailSend.sendWithHtml("duliu1231@foxmail.com", "这是一封邮件", "<html><body><img src='http://www.baidu.com/img/superlogo_c4d7df0a003d3db9b65e9ef0fe6da1ec.png'></body></html>");
	}
	
	@Test
	public void testSendWithAttachemnt() throws MessagingException {
		simpleMailSend.sendWithAttachemnt("duliu1231@foxmail.com", "这是一封邮件", "你好,\n\n这个是一个包含附件的邮件。", Arrays.asList("classpath:static/logo.png"));
	}
}
