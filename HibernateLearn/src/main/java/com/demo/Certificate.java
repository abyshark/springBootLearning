package com.demo;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Certificate {
	
	private String course;
	private String duration;

}
