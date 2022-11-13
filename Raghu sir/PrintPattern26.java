/*
1
01
010
1010
10101
*/
import java.util.Scanner;
class PrintPattern26
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int x=1;
		for (int i=1;i<=n ;i++)
		{
			for (int j=1;j<=i;j++ )
			{
				System.out.print(x%2+" ");
				x++;
			}
			System.out.println();
			
		}
		
	}
}
