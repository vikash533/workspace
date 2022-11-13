/*
12345
 1234
  123
   12
    1
*/
import java.util.Scanner;
class PrintPattern39
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
        int st=n;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=i-1 ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=st ;j++ )
			{
				System.out.print(j);
			}
			System.out.println();
			st--;
		}
	}

}