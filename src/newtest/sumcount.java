package newtest;

import java.util.Scanner;

public class sumcount {

	public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Input an integer: ");
      int digits = in.nextInt();
	  System.out.println("The sum is " + sumDigits(digits));
    }

 public static int sumDigits(int n) {
		int result = 0;
		
		while(n>0)
		{
			result = result+ (n%10);
			n=n/10;
		}
		return result;
 }
}
