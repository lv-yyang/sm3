package com.ly.dao;

import java.util.List;

import com.ly.pojo.Book;

public interface Bookdao {
	public Book queryBookById(int id);
	public List<Book> queryBookAll();
	public int addbook(Book book);
	public int deletebook(int id);
	public int updatebook(Book book);
}
