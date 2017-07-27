import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/*
		 * System.out.println("Enter a Number: ");
		 * 
		 * int value = scanner.nextInt();
		 * 
		 * while (value !=5){ System.out.println("Enter a Number: ");
		 * 
		 * value = scanner.nextInt();
		 * 
		 * }
		 */
		int value = 0;
		do {
			System.out.println("Enter a Number: ");

			value = scanner.nextInt();

		} while (value != 5);
		System.out.println("Got 5!");
	}
}
