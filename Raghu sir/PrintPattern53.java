/*
    *
   ***
  *****
 *******
  *****
   ***
    *
*/
import java.util.Scanner;
class PrintPattern53
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int st=1,sp=n/2;
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
			if(i<=n/2)
			{
			st=st+2;
			sp--;
			}
			else 
			{
			   st=st-2;
			   sp++;
			}
		}
		
	}

}