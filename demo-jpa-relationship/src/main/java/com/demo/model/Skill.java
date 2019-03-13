package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String skillName;
	private int skillRate;

}
