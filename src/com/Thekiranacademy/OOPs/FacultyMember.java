package com.Thekiranacademy.OOPs;

public class FacultyMember extends LibraryMember {
	
	@Override
	 public void  borrowItem(LibraryItem item) {
		if(item.isAvailable()) {
		item.borrow();
		System.out.println("Faculty Member Info");
		 System.out.println("Name : "+getName());
		 System.out.println("ID : "+getMemberID());
		 System.out.println("Borrow  : "+item.getTitle());
		}
		else {
			System.out.println(" Not Available");
		}
	 }

	@Override
	public void reserveItem(LibraryItem item) {
		System.out.println("Faculty Member Info");
		System.out.println("Name : "+getName());
		 System.out.println("ID : "+getMemberID());
		 System.out.println("Reserved : "+item.getTitle());
	}

}
