package com.masai.service;

import com.masai.Entity.Book;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomethingWentWrong;

public interface IBookService {
	public void addBook(Book book) throws SomethingWentWrong;
	public void updateBook() throws NoRecordFoundException , SomethingWentWrong;
	public void removeBook() throws NoRecordFoundException , SomethingWentWrong;
	
}
