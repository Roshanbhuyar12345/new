package com.crudop.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Book_ID")
	private int id;
	@Column(name="Book_Name")
	private String bookName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Author author;
	
	public Books(int id, String bookName, Author author) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", bookName=" + bookName + ", author=" + author + "]";
	}

	
	
}
