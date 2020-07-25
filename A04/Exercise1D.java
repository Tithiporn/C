import java.util.Scanner;
public class Exercise1D
{
	public static int sum=0;
	public static int i;
	public static int lenght;
	public static String ScanString;
	private static Scanner scanString2;
	
	public static void main(String[] args)
	{
		scanString2 = new Scanner(System.in);
        System.out.print("Please Enter number : ");
        String number = scanString2.nextLine();
   
        for(i=0;i<number.length();i++)
        {
        	if((Character.getNumericValue(number.charAt(i))) % 2 != 0)
        	{
        		sum += Character.getNumericValue(number.charAt(i));
        	}
        }
        System.out.println("The sum of all odd digits of n. " + sum);
    }
}