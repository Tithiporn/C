
public class Exercise2
{
	public static int i;
	public static int j;
	public static int[][] k = {{0,0,0,1,2,3,4},{5,6,7,8,9,10,11},{12,13,14,15,16,17,18},{19,20,21,22,23,24,25},{26,27,28,29,30,31,0}};
	public static void main(String[] args) 
	{	
		System.out.println("S\tM\tT\tW\tTh\tF\tSa");
		for(i=0;i<1;i++)
		{
			for(j=0;j<7;j++)
			{	
				System.out.print(k[0][j]+ "\t");
			}
			System.out.println();
		}
		for(i=0;i<1;i++)
		{
			for(j=0;j<7;j++)
			{	
				System.out.print(k[1][j]+ "\t");
			}
			System.out.println();
		}
		for(i=0;i<1;i++)
		{
			for(j=0;j<7;j++)
			{	
				System.out.print(k[2][j]+ "\t");
			}
			System.out.println();
		}
		for(i=0;i<1;i++)
		{
			for(j=0;j<7;j++)
			{	
				System.out.print(k[3][j]+ "\t");
			}
			System.out.println();
		}
		for(i=0;i<1;i++)
		{
			for(j=0;j<7;j++)
			{	
				System.out.print(k[4][j]+ "\t");
			}
			System.out.println();
		}		
	}
}
