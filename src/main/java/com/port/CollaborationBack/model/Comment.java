package com.port.CollaborationBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "comment")
@Component
public class Comment {
	
	@Id
	@Column(name="serialNo")
	@GeneratedValue
	private String serialNo;
	
	private String eventId;
	private String userId;
	private String commends;

}
