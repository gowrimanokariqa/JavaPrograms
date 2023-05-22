package BasicPrograms;

public class swapTwoString {

	public static void main(String[] args) {
		int number1 = 1526;
		int number2 = 256;
		
		//using temp variable
		System.out.println("before swapping "+number1+ " & " +number2);
		int temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("after swapping "+number1+ " & " +number2);		
		
		//using the Addition & subtraction
		System.out.println("before swapping "+number1+ " & " +number2);
		number1=number1-number2;
		number2=number1+number2;
		number1=number2-number1;
		System.out.println("after swapping "+number1+ " & " +number2);	
		
		//using the Multiplication & Division
		System.out.println("before swapping "+number1+ " & " +number2);
		number1=number1*number2;
		number2=number1/number2;
		number1=number1/number2;
		System.out.println("after swapping "+number1+ " & " +number2);	
	}
}
