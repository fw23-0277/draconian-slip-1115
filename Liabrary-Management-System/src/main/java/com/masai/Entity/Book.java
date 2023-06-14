package com.masai.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private int id;
	
	@Column(nullable = false , unique = false , length = 50)
	private String title;
	
	@Column(nullable = false , length = 50)
	private String author;
	
	@Column(nullable = false , length = 50)
	private  String genre;
	
	@Column(columnDefinition = "int(10) default 1")
	private boolean  availability;
	
	@Column(nullable = false , name = "book_count")
	private int count;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, String genre, int count) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.count = count;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", availability="
				+ availability + ", count=" + count + "]";
	}
	
	
}
