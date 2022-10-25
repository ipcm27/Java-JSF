package br.com.caelum.bookstore.bean;

import javax.faces.bean.ManagedBean;

import br.com.caelum.bookstore.model.Book;

@ManagedBean
public class BookBean {
	private Book book;
	
	
	


	public Book getBook() {
		return book;
	}


	public void Save(){
	    System.out.println("Saving Book!");
	}



}
