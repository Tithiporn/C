import java.util.Scanner;
public class Exercise3 
{	
	public String[] name;
	public static String[] max;
	public static String topString, middleString, bottomString;
	private static Scanner sc;
	
	public static void main(String[] args) 
	{
		 sc = new Scanner(System.in);
	        System.out.print("Insert Name : ");
	        String a = sc.nextLine();
	        System.out.print("Insert Name : ");
	        String b = sc.nextLine();
	        System.out.print("Insert Name : ");
	        String c = sc.nextLine();
	        
	        String top = a;
	        String bottom = a;
	        if( top.compareTo(b) > 0) 
	        	{ 
	        		top = b; 
	        	} 
	        if( top.compareTo(c) > 0)
	        	{ 
	        		top = c; 
	        	} 
	        if( bottom.compareTo(b) < 0) 
	        	{ 
	        		bottom = b; 
	        	} 
	        if( bottom.compareTo(c) < 0) 
	        	{ 
	        		bottom = c; 
	        	}   
	        String middle;
	        if( !a.equals(bottom) && !a.equals(top) ) 
	        	{ 
	        		middle = a; 
	        	} 
	        else if( !b.equals(bottom) && !b.equals(top) ) 
	        	{ 
	        		middle = b; 
	        	} 
	        else 
	        	{ 
	        		middle = c; 
	        	} 
	        System.out.println( top ); 
	        System.out.println( middle ); 
	        System.out.println( bottom ); 
	        } 
}
