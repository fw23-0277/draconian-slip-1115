package com.masai.ui;

import java.util.ResourceBundle;
import java.util.Scanner;

import com.masai.entity.Book;
import com.masai.exception.InvalideCredential;
import com.masai.exception.SomethingWentWrong;
import com.masai.service.BookService;
import com.masai.service.IBookService;
import com.masai.utility.Colors;

public class AdminUi {

	// addmin Signin
	public static void addminSignIn(Scanner sc) throws InvalideCredential {

		ResourceBundle rb = ResourceBundle.getBundle("adminCredentials");
		

		System.out.print("Enter Admin Username : ");
		String username = sc.next();
		System.out.print("Enter Admin Password : ");
		String password = sc.next();
		if (rb.getString("username").equals(username) && rb.getString("password").equals(password)) {
			System.out.println(Colors.BackgroundGreen + Colors.BrightWhite + " Admin Login Sucessfully. " + Colors.Reset);
			adminMenu(sc);
		} else {
			System.out.println();
			throw new InvalideCredential(Colors.BackgroundRed + Colors.BrightWhite + " Invalid Credential...! Try Again " + Colors.Reset);
		}

	}

	// addmin menu
	public static void adminMenu(Scanner sc) {
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
			System.out.print("Enter Your Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				break;
			case 2:
				addBook(sc);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				break;
			default:
				System.out.println("You Select Invalid choice");
			}
		} while (choice != 0);
	}

	static void addBook(Scanner sc) {
		System.out.println("Enter Book Title :");
		String title = sc.next();
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
			System.out.println(e.getLocalizedMessage());
		}
	}
}
