package com.Lms;

import java.util.Scanner;

public class LMSMainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();
        UserClass user = new UserClass();
        String username = null;

        int choice;
while(true)
        {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:
                System.out.print("Enter book type (1-Fiction, 2-Non-Fiction): ");
                int type = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Book title: ");
                String title = sc.nextLine();

                System.out.print("Enter book author: ");
                String author = sc.nextLine();

                System.out.print("Enter Number of copies: ");
                int copiesAvailable = sc.nextInt();
                sc.nextLine();

                if (type == 1) {

                    System.out.print("Enter genre: ");
                    String genre = sc.nextLine();

                    FictionBook fiction =
                            new FictionBook(title, author, copiesAvailable, genre);

                    library.addBook(fiction);

                } else if (type == 2) {

                    System.out.print("Enter subject: ");
                    String subject = sc.nextLine();

                    NonFictionBook nonFiction =
                            new NonFictionBook(title, author, copiesAvailable, subject);

                    library.addBook(nonFiction);

                } else {
                    System.out.println("Invalid book type.");
                }

                break;

            case 2:
                library.DisplayAllBooks();
                break;

            case 3:
                System.out.print("Enter title to search: ");
                String searchTitle = sc.nextLine();

                library.searchBook(searchTitle);
                break;

            case 4:
            	System.out.println("Enter Your Name:");
            	 username=sc.nextLine();
                System.out.print("Enter title to borrow: ");
                String borrowTitle = sc.nextLine();

                // Search the library array for the book
                boolean borrowFound = false;

                for (int i = 0; i < library.bookcount; i++) {

                    if (library.books[i].getTitle().equals(borrowTitle)) {

                        user.userBorrow(library.books[i]);
                        borrowFound = true;
                        break;
                    }
                }
                System.out.println(username+" borrowed the " + borrowTitle);

                if (!borrowFound) {
                    System.out.println("Book not found.");
                }

                break;

            case 5:
                System.out.print("Enter book title to return: ");
                String returnTitle = sc.nextLine();
                

                boolean returnFound = false;

                for (int i = 0; i < user.bookcount; i++) {

                    if (user.borrowbook[i] != null &&
                        user.borrowbook[i].getTitle().equals(returnTitle)) {

                        user.userReturn(user.borrowbook[i]);
                        returnFound = true;
                        System.out.println(username + " returned the Book" + returnTitle);

                        break;
                    }
                   
                }
                
                if (!returnFound) {
                    System.out.println("You have not borrowed this book.");
                }

                break;

            case 6:
                System.out.println("Thank you for using Library Management System.");
                break;

            default:
                System.out.println("Invalid choice.");
            }

        } 

        
    }
}