package com.masai.dao;

import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomethingWentWrong;

public interface IBookDAO {
	public void addBook() throws SomethingWentWrong;
	public void updateBook() throws NoRecordFoundException , SomethingWentWrong;
	public void removeBook() throws NoRecordFoundException , SomethingWentWrong;
	
}
