package com.port.CollaborationBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "jobs")
@Component
public class Jobs {
	@Id
	@Column(name="jobId")
	@GeneratedValue
	private String jobId;
	
	private String jobName;
	private String companyName;
	private String designation;
	private String location;
	private String technologiesExpected;
	private String address;
	
}
