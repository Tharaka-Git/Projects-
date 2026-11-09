package com.Lms;



public class UserClass {
	String username;
	int bookcount=0;
	boolean found=true;
	
	
Books[] borrowbook=new Books[5];
void userBorrow(Books book) {
	if(book.borrowBook()==true) {
		borrowbook[bookcount]=book;
		bookcount++;
	}
	else {
		System.out.println("not available");
	}
}
void userReturn(Books book) {
	for(int i=0;i<bookcount;i++) {
		
	if (borrowbook[i] != null && 
		    borrowbook[i].getTitle().equals(book.getTitle())) {
		
		book.returnBook();
		for (int j = i; j < bookcount - 1; j++) {
            borrowbook[j] = borrowbook[j + 1];
        }

        // Remove the duplicate last reference
        borrowbook[bookcount - 1] = null;

        // Decrease borrowed book count
        bookcount--;

        found = true;
        break;
    }
}

if (!found) {
    System.out.println("This book was not borrowed by this user.");
}
}
}
