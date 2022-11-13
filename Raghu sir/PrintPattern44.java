/*
    1
   123
  12345
 1234567
123456789
*/
import java.util.Scanner;
class PrintPattern44
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
        int st=1;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n-i ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=st ;j++ )
			{
				System.out.print(j);
			}
			System.out.println();
			st=st+2;
		}

	}

}