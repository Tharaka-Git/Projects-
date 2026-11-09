package com.Lms;

public class Library {
	Books[] books = new Books[5];
	int bookcount = 0;
	String usertitle;

	void addBook(Books book) {
		if (bookcount == books.length) {

			System.out.println("library is full");
		} else {
			books[bookcount] = book;
			bookcount++;
		}

	}

	void DisplayAllBooks() {
		for (int i = 0; i < bookcount; i++) {
			books[i].displayDetails();

		}
	}

	void searchBook(String title) {
		boolean found = false;
		for(int i=0;i<bookcount;i++) {
			
			if(books[i].getTitle().equals(title))
			{
				books[i].displayDetails();
				found=true;
			}
		}
		if(found==false) {
			System.out.println("book not found");
		}

	}

}
