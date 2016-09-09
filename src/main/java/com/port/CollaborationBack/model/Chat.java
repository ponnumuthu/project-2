package com.port.CollaborationBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "chat")
@Component
public class Chat {

	@Id
	@Column(name="serialNo")
	@GeneratedValue
	private String serialNo;
	
	private String sender;
	private String receiver;
	private String message;
	
}
