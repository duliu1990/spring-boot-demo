package com.proliu.thymeleaf.mail.service;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {
	
	@Autowired
	private EmailService emailService;
	
	@Test
	void testSendRegisteredNotification() {
		
		EmailNotificationReqDto emailNotificationReqDto = new EmailNotificationReqDto();
		
		emailNotificationReqDto.setAccessCode("1231312");
		emailNotificationReqDto.setDeadlineDate(new Date());
		emailNotificationReqDto.setEmailAddr("darren_l_du@manulife.com");
		emailNotificationReqDto.setTitle("Mrs.");
		emailNotificationReqDto.setFirstName("Du");
		emailNotificationReqDto.setLastName("Darren");
		
		emailService.sendRegisteredNotification(emailNotificationReqDto);
	}
}
