package BasicPrograms;

import java.util.Scanner;

public class LengthofString {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		System.out.println("Length of the String using length method is "+name.length() );
		
		char[] charArray = name.toCharArray();
		int length = 0 ;
		for (char c : charArray) {
			length++;
		}
		System.out.println("Length of the string using second method " +length);
	}

}
