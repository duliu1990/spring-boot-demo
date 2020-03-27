package com.proliu.thymeleaf.mail.service;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class EmailNotificationReqDto {
	
	private String title;
	
	private String firstName;
	
	private String lastName;
	
	private String accessCode;
	
	private String campaignId;
	
	private Date deadlineDate;
	
	private String emailAddr;
}
