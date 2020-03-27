package com.proliu.thymeleaf.mail.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private TemplateEngine emailTemplateEngine;

	/**
	 * @param emailNotificationReqDto
	 */
	public EmailNotificationRespDto sendRegisteredNotification(EmailNotificationReqDto emailNotificationReqDto) {
		// TODO Auto-generated method stub
		final Context ctx = new Context(LocaleContextHolder.getLocale());
		ctx.setVariable("title", emailNotificationReqDto.getTitle());
		ctx.setVariable("fisrtName", emailNotificationReqDto.getFirstName());
		ctx.setVariable("lastName", emailNotificationReqDto.getLastName());
		ctx.setVariable("accessCode", emailNotificationReqDto.getAccessCode());
		ctx.setVariable("deadlineDate", emailNotificationReqDto.getDeadlineDate());
		
		final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
        final MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "UTF-8");
        try {
			message.setSubject("Example HTML email (simple)");
			message.setFrom("duliu@devnp.com");
	        message.setTo(emailNotificationReqDto.getEmailAddr());
	        
			final String htmlContent = this.emailTemplateEngine.process("travel-register-complete", ctx);
			
			message.setText(htmlContent, true);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			log.error("message has error {}", e.getMessage());
		}
		
		 // Send email
        this.mailSender.send(mimeMessage);

		return null;
	}

}
