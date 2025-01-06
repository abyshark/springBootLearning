package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Question {

	@Id
	@Column(name = "question_id")
	private int questionId;
	
	private String question;
	
	@OneToOne
	@JoinColumn(name = "a_id")
	private Answer answer;
	
}
