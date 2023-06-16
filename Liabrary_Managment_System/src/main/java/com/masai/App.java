package com.masai;

import java.util.Scanner;

import com.masai.exception.InvalideCredential;
import com.masai.ui.AdminUi;
import com.masai.utility.Colors;

public class App {

	static {
		System.out.println(Colors.BackgroundBrightMagenta + Colors.White + "|========================================|");
		System.out.println("| 📚📚📚 𝓛𝓲𝓪𝓫𝓻𝓪𝓻𝔂 𝓜𝓪𝓷𝓪𝓰𝓶𝓮𝓷𝓽 𝓢𝔂𝓼𝓽𝓮𝓶 📚📚📚 |");
		System.out.println("|========================================|" + Colors.Reset);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice;
		do {
			System.out.println();
			System.out.println(Colors.BackgroundCyan + Colors.BrightBlack+"|----------------------------|");
			System.out.println("| 1)| Addmin Sign In         |");
			System.out.println("|----------------------------|");
			System.out.println("| 2)| Student Sign In        |");
			System.out.println("|----------------------------|");
			System.out.println("| 3)| Create Student Account |");
			System.out.println("|----------------------------|");
			System.out.println("| 0)| Close Application      |");
			System.out.println("|----------------------------|" + Colors.Reset);

			System.out.println();
			System.out.print("Enter Yout Choice : ");
			choice = sc.nextInt();
			

			switch (choice) {
			case 1:
				try {
					AdminUi.addminSignIn(sc);
				} catch (InvalideCredential e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 0:
				break;
			default:
				System.out.println("Thank For Using Our Services...!");
				break;
			}
			;
		} while (choice != 0);

	}
}
