package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
