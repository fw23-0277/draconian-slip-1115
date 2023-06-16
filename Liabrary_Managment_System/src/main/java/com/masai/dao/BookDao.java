package com.masai.dao;

import com.masai.entity.Book;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomethingWentWrong;
import com.masai.utility.EMUtils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;

public class BookDao implements IBookDao {

	public void viewAllBooks() throws NoRecordFoundException, SomethingWentWrong {
		// TODO Auto-generated method stub
		EntityManager en = null;
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public String addBook(Book book) throws SomethingWentWrong {
		// TODO Auto-generated method stub

		EntityManager em = null;
		EntityTransaction et = null;

		try {
			em = EMUtils.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(book);
			et.commit();
			return "Book Added Succesfully.";
		} catch (PersistenceException e) {
			// TODO: handle exception
			throw new SomethingWentWrong("Oops..! Unable to Add Book.");
		}finally {
			em.close();
		}

	}

}
