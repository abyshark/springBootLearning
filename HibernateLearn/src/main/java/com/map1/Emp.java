package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Emp {

	@Id
	private int eId;
	private String name;
	@ManyToMany
	@JoinTable(name = "emp_learn",
	joinColumns = {@JoinColumn(name= "eid")},
	inverseJoinColumns = {@JoinColumn(name="pid")})
	private List<Project> projects;
}
