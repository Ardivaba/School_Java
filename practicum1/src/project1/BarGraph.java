package project1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BarGraph {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		int number = 0;
		int max = 0;
		System.out.println("Insert a number: ");
		while((number = scanner.nextInt()) > 0)
		{
			System.out.println("Insert a number: ");
			numbers.add(number);
			if(number > max)
				max = number;
		}
		
		for(int i = 0; i <= max; i++)
		{
			for (Integer num : numbers) {
				if(i <= num)
					System.out.print("x ");
			}
			
			System.out.println();
		}
		
		scanner.close();
	}
}
