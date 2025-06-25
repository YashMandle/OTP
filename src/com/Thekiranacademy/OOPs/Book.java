package com.Thekiranacademy.OOPs;

public class Book extends LibraryItem{
	
    private String author;
	
	private String isbm;
	
	public Book(String title, int itemID,String author) {
		super(title, itemID);
		this.author=author;

	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbm() {
		return isbm;
	}
	public void setIsbm(String isbm) {
		this.isbm = isbm;
	}
	
	public void displayInfo() {
		System.out.println("Title : "+getTitle());
		System.out.println("Item ID Number "+getItemID());
		System.out.println("Author : "+getAuthor());
	}

}
