package newtest;

public class Arraysortingascending {

	
public static void main(String[] args) {
		

		int a[] = {101,4,3,100,7,2,89,9,56,23,11,24,83};
		int temp = 0;

		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
		}
		
		System.out.println();
		System.out.println("The array in ascending order is: ");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		}
		
	}



















