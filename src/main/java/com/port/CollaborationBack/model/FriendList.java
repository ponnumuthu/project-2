package com.port.CollaborationBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "friend")
@Component
public class FriendList {

	@Id
	@Column(name="serialNo")
	@GeneratedValue
	private String serialNo;
	
	private String userId;
	private String friendId;
	private String friendName;
	private long phoneNo;
	private String emailId;
	
	
}
