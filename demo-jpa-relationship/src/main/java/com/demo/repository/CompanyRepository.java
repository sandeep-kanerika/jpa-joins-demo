package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
