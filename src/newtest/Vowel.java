package newtest;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = in.nextLine();
		
		System.out.println("Your entered String is: "+s);
		String s2 = s.toLowerCase();
		System.out.println("The vowel count in your entered string is:" + vowelCount(s2));
	}
	
	
	public static int vowelCount(String s2)
	{
		int count=0;
		
		for(int i=0; i<s2.length();i++)
		{
			if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u')
			{
				count++;
			}
		}
		return count;
	}
		
}
