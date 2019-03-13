package com.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data

public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String companyName;
	private String location;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "companyId")
	private List<Employee> employees;
}
