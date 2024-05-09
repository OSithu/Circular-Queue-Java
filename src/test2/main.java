package test2;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Enter Word: ");
		String word = scn.nextLine();
		
		int len = word.length();
		
		Queue q1 = new Queue(len);
		
		for(int i=len-1;i>=0;i--) {
			q1.insert(word.charAt(i));
		}
		
		while(!q1.isEmpty()) {
			System.out.print(q1.remove()+ " ");
		}
	}

}
