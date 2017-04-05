package project1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write numbers to sum (split by space): ");
		String numbers = scanner.nextLine();
		scanner.close();
		
		String[] numbersSplit = numbers.split(" ");
		
		int sum = 0;
		for (String numberString : numbersSplit) {
			int number = Integer.parseInt(numberString);
			sum += number;
		}
		
		System.out.format("Sum of numbers is: %2d", sum);
	}

}
