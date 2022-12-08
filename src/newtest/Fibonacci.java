package newtest;

public class Fibonacci {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c;
		System.out.print(a+", "+b+", ");
		for(int i=1; i<10; i++)
		{
		
			c=a+b;
			System.out.print(c+", ");
			
			a=b;
			b=c;
			
			
		}

	}

}

//0 1 1 2 3 5 8 13 23