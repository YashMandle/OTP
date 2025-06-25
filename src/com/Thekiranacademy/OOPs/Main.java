package com.Thekiranacademy.OOPs;

public class Main {
	public static void main(String[] args) {
		Book b = new Book("Java",123,"James Gosling");
		
		b.displayInfo();
		
		System.out.println("------******--------");
		
		DVD d = new DVD("The Lord of the Rings",123,20);
		d.displayInfo();
		
		System.out.println("------******--------");
		
		
		StudentMember S = new StudentMember();
		S.setName("Yash");
		S.setMemberID(123);
		S.reserveItem(b);
		System.out.println("------******--------");
		S.borrowItem(b);
		System.out.println("------******--------");
		S.borrowItem(b);
		
		System.out.println("------******--------");
		
		FacultyMember f = new FacultyMember();
		
		f.setMemberID(444);
		f.setName("DR. Sharma");
		f.borrowItem(d);
		
		System.out.println("------******--------");
		f.borrowItem(d);
		
		System.out.println("------******--------");
		
		f.returnItem(d);
		
		System.out.println("------******--------");
		
		f.borrowItem(d);
	
	}

}
