package com.masai.dao;

import java.util.List;

import com.masai.Entity.Book;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomethingWentWrong;

public interface IBookDAO {
	public List<Book> viewAllBooks() throws NoRecordFoundException , SomethingWentWrong;
	public String addBook(Book book) throws SomethingWentWrong;
	public void updateBook() throws NoRecordFoundException , SomethingWentWrong;
	public void removeBook() throws NoRecordFoundException , SomethingWentWrong;
	
}
