package com.Thekiranacademy.OOPs;

public class LibraryItem {
	
	private String title;
	private int itemID;
	private boolean isAvailable = true;
	
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public LibraryItem(String title, int itemID) {
		super();
		this.title = title;
		this.itemID = itemID;
	}
	
	public void displayInfo() {
		System.out.println("Title : "+getTitle());
		System.out.println("Item ID Number "+getItemID());
	}
	
	public void borrow() {
		isAvailable = false;
		
	}
	public void returnItem() {
		isAvailable = true;
	}
	

}
