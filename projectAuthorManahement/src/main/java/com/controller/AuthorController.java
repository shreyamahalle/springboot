package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.AuthorServiceImp;

@RestController
public class AuthorController {

	
	@Autowired
	AuthorServiceImp authorServiceImp;
	@PostMapping("/add")
	
	public void saveAuthor()
	{
		authorServiceImp.addAuthor();
	}

}
