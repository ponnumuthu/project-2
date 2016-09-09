package com.port.CollaborationBack.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="UserRole")
@Component
public class Role {

	private String roleId;
	private String roleName;
}
