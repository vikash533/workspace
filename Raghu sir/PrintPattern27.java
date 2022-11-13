/*
5
45
345
2345
12345
*/
import java.util.Scanner;
class PrintPattern27
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		for (int i=n;i>0 ;i--)
		{
			for (int j=i;j<=n;j++ )
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
			
		}
		
	}
}
