package com.masai.service;



import com.masai.entity.Book;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomethingWentWrong;

public interface IBookService {
	public void viewAllBooks() throws NoRecordFoundException , SomethingWentWrong;
	public String addBook(Book book) throws SomethingWentWrong;
}
