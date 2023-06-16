package com.masai.service;



import com.masai.dao.BookDao;
import com.masai.dao.IBookDao;
import com.masai.entity.Book;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomethingWentWrong;

public class BookService implements IBookService {
	
	public void viewAllBooks() throws NoRecordFoundException, SomethingWentWrong {
		// TODO Auto-generated method stub
		
	}

	public String addBook(Book book) throws SomethingWentWrong {
		// TODO Auto-generated method stub
		IBookDao bookDao = new BookDao();
		return bookDao.addBook(book);
	}

	

}
