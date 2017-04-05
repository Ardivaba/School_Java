package project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class OrderedNames {

	public static class NameComparator implements Comparator<String> {

		@Override
		public int compare(String firstName, String secondName) {
			char firstNameLastChar = (char)firstName.indexOf(firstName.length() - 1);
			char secondNameLastChar = (char)secondName.indexOf(secondName.length() - 1);
			
			return secondNameLastChar - firstNameLastChar;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Write (5) names: ");
		ArrayList<String> names = new ArrayList<String>();
		for(int i = 0; i < 5; i++)
		{
			String name = scanner.nextLine();
			names.add(name);
		}
		
		scanner.close();
		
		Collections.sort(names, new NameComparator());
		
		System.out.println("Sorted names:");
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
