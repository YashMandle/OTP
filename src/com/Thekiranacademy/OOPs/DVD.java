package com.Thekiranacademy.OOPs;

public class DVD extends LibraryItem{
	public DVD(String title, int itemID, int duration) {
		super(title, itemID);
		this.duration=duration;
	}

	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void displayInfo() {
		
		System.out.println("Title : "+getTitle());
		System.out.println("Item ID Number "+getItemID());
		System.out.println("Duration : "+getDuration());
	}
	

}
