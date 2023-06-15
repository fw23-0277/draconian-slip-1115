package com.masai.dao;

import java.util.List;

import com.masai.Colours;
import com.masai.Entity.Book;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomethingWentWrong;
import com.masai.utility.EMUtils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.Query;

public class BookDAO implements IBookDAO {

	public List<Book> viewAllBooks() {

		EntityManager em = null;
		List<Book> bookList = null;
		try {
			em = EMUtils.getEntityManager();
			String query = "SELECT b FROM Book b";
			Query createQuery = em.createQuery(query);
			bookList = (List<Book>) createQuery.getResultList();
			System.out.println(query);
		} catch (PersistenceException  | IllegalArgumentException | IllegalStateException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
		return bookList;
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
			return Colours.Green + "Book Added Succesfully.";
		} catch (PersistenceException | IllegalArgumentException | IllegalStateException e) {
			// TODO: handle exception
			et.rollback();
			throw new SomethingWentWrong("Oops...! Unabale to add Book.");
		} finally {
			em.close();
		}

	}

	public void updateBook() throws NoRecordFoundException, SomethingWentWrong {
		// TODO Auto-generated method stub

	}

	public void removeBook() throws NoRecordFoundException, SomethingWentWrong {
		// TODO Auto-generated method stub

	}

}
