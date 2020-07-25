
public class Exercise1B 
{
	public static int i;
	public static int a=0;
	public static int b=0;
	public static void main(String[] args) 
	{
		for(i=1;i<=100;i++)
		{
			System.out.println(i);
			a=i*i;
			
			System.out.println("i*i : " + a);	
			b+=a;
		}
		System.out.println("The sum of all squares between 1 and 100 is " + b);	
	}
}
