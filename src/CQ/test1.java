package CQ;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Enter Word: ");
		String word = scn.nextLine();
		
		int len = word.length();
		
		Stack myStack1 = new Stack(len);
		Stack myStack2 = new Stack(len);

		for(int i=0;i<len;i++) {
			
			myStack1.push(word.charAt(i));
			
		}
		
		while(!myStack1.isEmpty()) {
		
			myStack2.push(myStack1.pop());
			
		}
		
		while(!myStack2.isEmpty()) {
			System.out.print(myStack2.pop() + " | ");
			
		}
		
		
	}

}
