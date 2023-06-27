package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AuthorRepository;
import com.model.Author;

@Service
public class AuthorServiceImp implements AuthorService {
	
	@Autowired
	AuthorRepository authorRepo;
	
	
	public void addAuthor()
	{
		ArrayList<Author>au=new ArrayList<Author>();
		au.add(new Author("Raj","Pune"));
		au.add(new Author("Vipul","Mumbai"));
		au.add(new Author("Neha","Satara"));
		
		for(Author a:au)
			authorRepo.save(a);
	}
	
	

}
