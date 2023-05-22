package BasicPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		//String Name = "Gowrimanokari";
		
		System.out.println("Enter the name ");
		Scanner getName = new Scanner(System.in);
		String Name = getName.nextLine();
		
		
		//Using StringBuffer
		StringBuffer buffer = new StringBuffer();
		buffer.append(Name);
		System.out.println("Reversed String is "+ buffer.reverse());

		//Basic_Logic
		char[] charName = Name.toCharArray();
		String reversed = "";
		for(int i=charName.length-1;i>=0;i--) {
			reversed=reversed+charName[i];
		}
		System.out.println("Reverse using Logic " +reversed);
		
		//Using Collection
		List<Character> list = new ArrayList<Character>();
		for (Character character : charName) {
			list.add(character);
		}
		Collections.reverse(list);
		ListIterator iterator = list.listIterator();
		System.out.println("Reverse functon using collection is");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
