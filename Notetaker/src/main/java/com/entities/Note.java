package com.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "notes")
@Data
@NoArgsConstructor
public class Note {

	@Id
	private int id;
	private String title;
	@Column(length = 150)
	private String content;
	private Date addedDate;
	/**
	 * @param id
	 * @param title
	 * @param content
	 * @param addedDate
	 */
	public Note(String title, String content, Date addedDate) {
		super();
		this.id = new Random().nextInt(1000);
		this.title = title;
		this.content = content;
		this.addedDate = addedDate;
	}
		
}
