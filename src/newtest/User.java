package newtest;

import java.util.ArrayList;

public class User {
	

	public static void main(String[] args) {
		
		/*int a[][]= new int[3][4];
		a[0][0] = 22;
		a[0][1] = 4;
		a[0][2] = 6;
		a[0][3] = 8;
		a[1][0] = 3;
		a[1][1] = 6;
		a[1][2] = 9;
		a[1][3] = 12;
		a[2][0] = 1;
		a[2][1] = 8;
		a[2][2] = 12;
		a[2][3] = 16;*/
		int a[][] = {{9,101,8},{60,5,14},{19,67,28}};
		int min=a[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min = a[i][j];
				}
                
                }
			}
		
		System.out.println(min);
		System.out.println(a.length);
		
			ArrayList<String> al =new ArrayList<String>();
		al.add("coco");
		al.add("melon");
		al.add(null);
		al.add("Bus");
		al.add("null");
		al.add(null);
		al.set(2, "Babu");
		al.remove(4);
		System.out.println(al);

	}
}



















