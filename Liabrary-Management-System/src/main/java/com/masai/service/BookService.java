package com.masai.service;

import java.util.List;

import com.masai.Entity.Book;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomethingWentWrong;
import com.masai.dao.BookDAO;
import com.masai.dao.IBookDAO;

public class BookService implements IBookService {
	
	public List<Book> viewAllBooks() throws NoRecordFoundException, SomethingWentWrong{
		IBookDAO bookDAO = new BookDAO();
		return bookDAO.viewAllBooks();
	}

	public String addBook(Book book) throws SomethingWentWrong {
		// TODO Auto-generated method stub
		IBookDAO bookDAO= new BookDAO();
		return bookDAO.addBook(book);
	}

	public void updateBook() throws NoRecordFoundException, SomethingWentWrong {
		// TODO Auto-generated method stub

	}

	public void removeBook() throws NoRecordFoundException, SomethingWentWrong {
		// TODO Auto-generated method stub

	}

	

}
