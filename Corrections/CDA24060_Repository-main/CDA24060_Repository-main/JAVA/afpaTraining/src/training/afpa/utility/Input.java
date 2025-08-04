package training.afpa.utility;

import java.util.Scanner;

public class Input {
	
	private static Scanner scan = new Scanner(System.in);
	
	private Input() {
	}
	
	public static String getString(String message) {
		
		System.out.println(message);
		return scan.nextLine();
		
	}
	
	public static int getInt(String message) {
		
		System.out.println(message);
		return scan.nextInt();
		
	}

	public static void close() {
		scan.close();
	}
	
	public static void message(String message) {
		System.out.println(message);
	}
}
