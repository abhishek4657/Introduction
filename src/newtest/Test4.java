package newtest;



public final class Test4{
	
	
    public static void main(String[] args)
    {
    	int[] a = {1};
    	Test4 t = new Test4();
    	t.increment(a);
    	System.out.println("Hello: "+a[a.length-1]);
    	
    }
    
   void increment(int[] i)
   {
	   i[i.length-1]++;
   }
 
}
