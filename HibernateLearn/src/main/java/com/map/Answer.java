package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {

	@Id
	@Column(name = "answer_id")
	private int answerId;
	private String ans;
	
	@OneToOne(mappedBy = "answer")
	Question question;
}
