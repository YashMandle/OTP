package com.Thekiranacademy.OOPs;

public class StudentMember extends LibraryMember{
	


	@Override
	public void reserveItem(LibraryItem item) {
		System.out.println("Student Member Info");
		System.out.println("Member ID : "+getMemberID());
		System.out.println("Member Name : "+getName());
		System.out.println("Reserved : "+item.getTitle());
		

		
	}

	@Override
	public void borrowItem(LibraryItem item) {
		if(item.isAvailable()) {
			item.borrow();
			System.out.println("Student Member Info");
			 System.out.println("Name : "+getName());
			 System.out.println("ID : "+getMemberID());
			 System.out.println("Borrow  : "+item.getTitle());
			}
			else {
				System.out.println(" Not Available");
			}
		
	}


}
