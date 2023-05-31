package BasicPrograms;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of lines ");
		int noOfRow = scan.nextInt();
		
		//from one to no of row
		int row, column;
		for(row=0;row<noOfRow;row++){
			for(column=0;column<=row;column++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		

		System.out.println("Enter no of lines ");
		int noOfRow1 = scan.nextInt();
		
		//from no of row to one
		for(row=noOfRow1;row>0;row--) {
			for(column=row;column>0;column--) {
				System.out.print("* ");
			}
		System.out.println();
		}
	
		int startNumber = 1;
		System.out.println("Enter the Limit ");
		int rowCount = scan.nextInt();
		
		for(row=0;row<rowCount;row++) {
			for(column=0;column<=row;column++) {
				System.out.print(startNumber+ " ");
				startNumber = startNumber+1;
			}
			System.out.println();
		}
	
	
	}
}
