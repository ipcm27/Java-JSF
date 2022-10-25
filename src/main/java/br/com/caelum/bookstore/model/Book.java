package br.com.caelum.bookstore.model;

public class Book {
	
	private String title;
	
	private String isbn;
	private double price;
	private String launchData;
	
	public Book() {
	
	}
	
	public String getTitle() {
		return title;
	}
	public String getIsbn() {
		return isbn;
	}
	public double getPrice() {
		return price;
	}
	public String getLaunchData() {
		return launchData;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setLaunchData(String launchData) {
		this.launchData = launchData;
	}
	
	

}
