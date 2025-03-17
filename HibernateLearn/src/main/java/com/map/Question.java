package com.map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Question {

	@Id
	@Column(name = "question_id")
	private int questionId;
	
	private String question;
	
//	@OneToOne
//	@JoinColumn(name = "a_id")
//	private Answer answer;
	
	/*
	 * Eager loading to fetch the data at the time of call only 
	 * and does not need get method to call this col at the time of get method call on the class.
	 */
	@OneToMany(mappedBy = "question",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//	@JoinColumn(name = "a_id")
	private List<Answer> answers;
	
}
