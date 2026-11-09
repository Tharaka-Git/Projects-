package com.Lms;

public class Books {
	private String title;
	private String author;
	private int copiesAvailable;

	public Books(String title, String author, int copiesAvailable) {
		this.title = title;
		this.author = author;
		this.copiesAvailable = copiesAvailable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCopiesAvailable() {
		return copiesAvailable;
	}

	public void setCopies(int copies) {
		this.copiesAvailable = copies;
	}

	boolean borrowBook() {

		if (copiesAvailable > 0) {

			

			copiesAvailable = copiesAvailable - 1;
			System.out.println("copies available :" +copiesAvailable);

			return true;
		} else {
			return false;
		}
	}

	boolean returnBook() {
		if (copiesAvailable < copiesAvailable) {

			copiesAvailable = copiesAvailable + 1;
		}
		return false;
	}

	void displayDetails() {
		System.out.println(copiesAvailable);
		System.out.println(title);
		System.out.println(author);
	}

}