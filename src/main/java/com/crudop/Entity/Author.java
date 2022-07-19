package com.crudop.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int author_Id;
	
	private String first_Name;
	
	private String Last_name;
	
	private String language;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(int author_Id, String first_Name, String last_name, String language) {
		super();
		this.author_Id = author_Id;
		this.first_Name = first_Name;
		Last_name = last_name;
		this.language = language;
	}

	public int getAuthor_Id() {
		return author_Id;
	}

	public void setAuthor_Id(int author_Id) {
		this.author_Id = author_Id;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String last_name) {
		Last_name = last_name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Author [author_Id=" + author_Id + ", first_Name=" + first_Name + ", Last_name=" + Last_name
				+ ", language=" + language + "]";
	}
	
	
	
}
