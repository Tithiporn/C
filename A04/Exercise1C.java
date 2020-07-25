import java.util.Scanner;
public class Exercise1C 
{
	public static int i;
	public static int m;
	public static int n;
	public static int a=0;
	private static Scanner sc;
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
        System.out.print("Please Enter the starting number : ");
        int m = sc.nextInt(); 
        System.out.println("Please Enter the ending number : ");
        int n = sc.nextInt(); 
		
        for(i=m;i<=n;i++)
        {		
			if(Math.floorMod(i, 2) != 0)
			{
				System.out.println(i);
			
				a+=i;
			}	
		}
		System.out.println("The sum of all odd numbers between "+m+"and"+n+"is"+a);		
	}
}
