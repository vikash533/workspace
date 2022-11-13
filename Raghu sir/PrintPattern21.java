/*
5
45
345
2345
12345
*/
import java.util.Scanner;
class PrintPattern21
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("enter the number");
		int n=sc.nextInt();
		for (int i=n;i>=1 ;i-- )
		{
		  for (int j=i;j<=5 ;j++)
		  {
             System.out.print(j+"");
			 
		  }
			System.out.println ();
			
		}
		
	}
}

