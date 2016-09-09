package com.port.CollaborationBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "blog")
@Component
public class Blog {

	@Id
	@Column(name="blogId")
	@GeneratedValue
	private String blogId;
	
	private String blogName;
	private String userId;
	private String content;
	private String status;
	private String message;
	
}
