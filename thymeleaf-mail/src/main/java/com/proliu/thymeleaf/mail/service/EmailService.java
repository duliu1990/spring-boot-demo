package com.proliu.thymeleaf.mail.service;

public interface EmailService {
	
	EmailNotificationRespDto sendRegisteredNotification(EmailNotificationReqDto emailNotificationReqDto);

}
