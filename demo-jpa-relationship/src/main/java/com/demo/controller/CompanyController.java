package com.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Company;
import com.demo.repository.CompanyRepository;

@RestController("/company")
public class CompanyController {

	@Autowired
	private CompanyRepository companyRepository;

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public Company createCompany(@RequestBody Company company) {
		return companyRepository.save(company);
	}

	@GetMapping(value="/company/{id}",consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Company getCompany(@PathVariable("id") int id) {
		Optional<Company> optional = companyRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}

	}

}
