package com.ly.test;

import java.util.List;

import org.junit.Test;

import com.ly.dao.Bookdao;
import com.ly.dao.impl.Bookdaoimpl;
import com.ly.pojo.Book;

public class Test1 {

	@Test
	public void test01(){
		Bookdao bookdao=new Bookdaoimpl();
		List<Book> queryBookAll = bookdao.queryBookAll();
		System.out.println(queryBookAll);
	}
	
	
	
	@Test
	public void test02(){
		Book book=new Book("小说",28f,"不知道","我");
		Bookdao bookdao=new Bookdaoimpl();
		int i = bookdao.addbook(book);
		System.out.println(i==1?"cg":"sb");
	}
	
	
	
	@Test
	public void test03(){
		Bookdao bookdao=new Bookdaoimpl();
		int i = bookdao.deletebook(8);
		System.out.println(i==1?"cg":"sb");
	}
	
	
	
	@Test
	public void test04(){
		Book book=new Book(6,"小说",2f,"知道","我啊");
		Bookdao bookdao=new Bookdaoimpl();
		bookdao.updatebook(book);
	}
}
