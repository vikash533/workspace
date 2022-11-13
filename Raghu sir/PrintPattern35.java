/*
    *
   ***
  *****
 *******
*********
*/
import java.util.Scanner;
class PrintPattern35
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int sp=n-1,st=1;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=sp ;j++ )
			{
               System.out.print(" ");
			}
             for (int j=1;j<=st ;j++ )
            {
               System.out.print("*");
            }
			System.out.println();
			sp--;
			st=st+2;

		}
		
	}
}
