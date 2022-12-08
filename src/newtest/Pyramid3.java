package newtest;

public class Pyramid3 {

	public static void main(String[] args) {

		int k=3;
		int l=1;
		int m;
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				m=k*l;
				System.out.print(m+"\t");
				l++;
				
			}
			System.out.println("");
		}

	}

}
