package BasicPrograms;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter number to reverse");
		Scanner getValue= new Scanner(System.in);
		number = getValue.nextInt();
		int reverse =0;
		while(number!=0) {
			reverse=reverse*10;
			reverse=reverse+number%10;
			number=number/10;
		}
		System.out.println("Reversed number "+reverse);
	}

}	
