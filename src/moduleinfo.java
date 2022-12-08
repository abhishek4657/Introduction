	//There is a list of string reverse the list (not to print the list in reverse order)
	import java.util.*;
	public class moduleinfo
	{
	    public static void main(String[] args)
	    {
	        ArrayList<String> al = new ArrayList<>();
	        al.add("one");
	        al.add("two");
	        al.add("Three");
	        al.add("Four");
	        System.out.println(al);
	        
	        ArrayList al2 = new ArrayList();
	        for(int i=al.size()-1; i>=0; i--)
	        {
	        al2.add(al.get(i));
	        }
	        System.out.println(al2);
	        
	    }
	}
