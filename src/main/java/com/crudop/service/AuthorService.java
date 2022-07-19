package com.crudop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudop.Entity.Author;
import com.crudop.repository.AuthorRepository;

@Service
public class AuthorService {
	@Autowired
	private AuthorRepository authorRepository;
    
	
	//adding Author
		public void saveAuthor(Author author) {
			this.authorRepository.save(author);
		}

}
