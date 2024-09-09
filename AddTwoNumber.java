package hello.eclipse;

import java.util.Scanner;

public class AddTwoNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1, number2;
		
		number1 = scanner.nextInt();
		number2 = scanner.nextInt();
		
		System.out.println(number1 + number2);
		scanner.close();
	}
}
