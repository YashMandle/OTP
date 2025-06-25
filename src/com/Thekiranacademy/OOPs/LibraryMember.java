
package com.Thekiranacademy.OOPs;

public abstract class LibraryMember implements Reservable {
	private int memberID;
	private String name;
	
	
	public int getMemberID() {
		return memberID;
	}


	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


   public abstract void  borrowItem(LibraryItem item);
   
   public void returnItem(LibraryItem item) {
       item.returnItem();
       System.out.println(getName() + " returned: " + item.getTitle());
   }

}
