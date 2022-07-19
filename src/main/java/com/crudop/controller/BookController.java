package com.crudop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudop.Entity.Author;
import com.crudop.Entity.Books;
import com.crudop.service.AuthorService;
import com.crudop.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private AuthorService authorService;

	// geting all books
	@GetMapping("/books")
	private List<Books> getAllBooks() {
		return this.bookService.getAllBooks();
	}

	// getting books by its id
	@GetMapping("/books/{id}")
	public Books getBooks(@PathVariable("id") int id) {
		
		return bookService.getById(id);
	}
	
	//adding author
	@PostMapping("/author")
	public Author addAuthor(@RequestBody Author author) {
		this.authorService.saveAuthor(author);
		return author;
	}

	// adding book
	@PostMapping("/books")
	public Books addBook(@RequestBody Books book) {
	   this.bookService.save(book);
		return book;
		
		

	}

	@PutMapping("/update")
	public Books update(@RequestBody Books book) {
		this.bookService.save(book);
		return book;

	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		
		this.bookService.delete(id);
		
	}

}
