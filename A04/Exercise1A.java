
public class Exercise1A 
{
	public static int i;
	public static int a=0;
	public static void main(String[] args)
	{
		for(i=2;i<=100;i++)
		{
			if(Math.floorMod(i, 2) == 0)
				{
					System.out.println(i);
					a+=i;
				}	
		}
		System.out.println("The sum of all even numbers between 2 and 100 is " + a);		
	}
}
