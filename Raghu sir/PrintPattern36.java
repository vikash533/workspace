/*
*********
 *******
  *****
   ***
    *
*/
import java.util.Scanner;
class PrintPattern36
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int sp=0,st=2*n-1;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=sp ;j++ )
			{
               System.out.print(" ");
			}
             for (int K=1;K<=st ;K++ )
            {
               System.out.print("*");
            }
			System.out.println();
			sp++;
			st=st-2;

		}
		
	}
}
