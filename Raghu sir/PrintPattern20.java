/*
54321
4321
321
21
1
*/
import java.util.Scanner;
class PrintPattern20
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("enter the number");
		int n=sc.nextInt();
		for (int i=n;i>=1 ;i-- )
		{
		  for (int j=i;j>=1 ;j--)
		  {
             System.out.print(j+"");
			 
		  }
			System.out.println ();
			
		}
		
	}
}

