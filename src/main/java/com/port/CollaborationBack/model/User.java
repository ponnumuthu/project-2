package com.port.CollaborationBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "user")
@Component
public class User {

	@Id
	@Column(name="userId")
	@GeneratedValue
	private String userId;
	
	private String userName;
	private String passWord;
	private String emailId;
	private String phoneNo;
	private String address;
	private String zipCode;
	
}
