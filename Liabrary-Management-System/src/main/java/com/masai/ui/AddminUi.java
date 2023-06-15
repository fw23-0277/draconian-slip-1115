package com.masai.ui;


import java.util.ResourceBundle;
import java.util.Scanner;

import com.masai.Entity.Book;
import com.masai.Exception.InvalidCredential;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomethingWentWrong;
import com.masai.service.BookService;
import com.masai.service.IBookService;

public class AddminUi {
	
		
	 	ResourceBundle rb = ResourceBundle.getBundle("addminCredentials");
		
		
	 	// addmin Signin 
		public static void addminSignIn(Scanner sc) throws InvalidCredential{
			
			ResourceBundle rb = ResourceBundle.getBundle("addminCredentials");
			
			System.out.print("Enter Admin Username : ");
			String username = sc.next();
			System.out.print("Enter Admin Password : ");
			String password = sc.next();
			if(rb.getString("username").equals(username) && rb.getString("password").equals(password)) {
				addminMenu(sc);
			}else {
				throw new InvalidCredential("Invalid Credential...! Try Again");
			}
			
		}
		
		// addmin menu 
		public static void addminMenu(Scanner sc) {
			int choice = 0;
			do {
				System.out.println("|----------------------------------|");
				System.out.println("| 1) View All Books         	   |");
				System.out.println("|----------------------------------|");
				System.out.println("| 2) Add New Book Into Liabrary    |");
				System.out.println("|----------------------------------|");
				System.out.println("| 3) Update Book By Id      	   |");
				System.out.println("|----------------------------------|");
				System.out.println("| 4) Search Book            	   |");
				System.out.println("|----------------------------------|");
				System.out.println("| 5) Delete Book By Id             |");
				System.out.println("|----------------------------------|");
				System.out.println("| 0) Logout                        |");
				System.out.println("|----------------------------------|");
				
				System.out.println();
				System.out.print("Enter Your Choice :");
				choice = sc.nextInt();
				switch(choice) {
				case 1 :
					viewAllBooks();
					break;
				case 2 :
					addBook(sc);
					break;
				case 3 :
					break;
				case 4 :
					break;
				case 5 :
					break;
				case 0 :
					break;
				default :
					System.out.println("You Select Invalid choice");
				}
			}while(choice != 0);
		}
	
		static void  addBook(Scanner sc) {
			System.out.print("Enter Book Title :");
			String title  = sc.next();
			System.out.print("Enter Book Author : ");
			String author = sc.next();
			System.out.print("Enter Book Genre : ");
			String genre = sc.next();
			System.out.print("Enetr Book Quantity : ");
			int quantity = sc.nextInt();
			
			IBookService bookService = new BookService();
			
			Book book = new Book(title, author, genre, quantity);
			try {
				String result = bookService.addBook(book);
				System.out.println(result);
			} catch (SomethingWentWrong e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
		}
		
		static void viewAllBooks() {
			IBookService bookService = new BookService();
			
			try {
				bookService.viewAllBooks();
			} catch (NoRecordFoundException | SomethingWentWrong e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
		}
		
	

}
