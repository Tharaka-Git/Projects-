package com.Lms;

public class FictionBook extends Books {

	private String genre;
	public FictionBook(String title, String author, int copiesAvailable,String genre) {
		super(title, author, copiesAvailable);
		this.genre=genre;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	void displayDetails(){
		
		
		System.out.println("Title:"+super.getTitle());
		System.out.println("Author:"+super.getAuthor());
		System.out.println("Available Copies:"+super.getCopiesAvailable());
		System.out.println("Genre:"+genre);
		
		
	}
	

}
