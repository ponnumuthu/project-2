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

public class UserRole {

	@Id
	@Column(name="userId")
	@GeneratedValue
	private int roleId;   
    private String userId;
	
}
