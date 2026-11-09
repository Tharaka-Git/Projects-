package com.Lms;

public class NonFictionBook  extends Books{
	private String subject;
	public NonFictionBook(String title, String author, int copiesAvailable,String subject) {
		super(title, author, copiesAvailable);
		this.subject=subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	void displayDetails(){
		System.out.println("Title:"+super.getTitle());
		System.out.println("Author:"+super.getAuthor());
		System.out.println("Available Copies:"+super.getCopiesAvailable());
	
			System.out.println("Subject"+subject);
		
		
	}

}
