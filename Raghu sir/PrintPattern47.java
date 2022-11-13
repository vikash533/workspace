/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/
import java.util.Scanner;
class PrintPattern47
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
        
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n-i ;j++ )
			{
				System.out.print(" ");
			}
			int x=1;
			for (int j=1;j<=2*i-1;j++ )
			{
				System.out.print((char)(x+64));
				if (j<i)
					x++;
				else
					x--;
			}
			
			System.out.println();
			
		}
	}

}