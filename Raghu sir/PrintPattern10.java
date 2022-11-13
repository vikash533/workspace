/*1
  21
  321
  4321
  54321*/
import java.util.Scanner;
class PrintPattern10
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("enter the number");
		int n=sc.nextInt();
		for (int i=1;i<=n ;i++ )
		{
			for (int j=i;j>=1 ;j-- )
			{
                System.out.print (j+"");
			
				
				
			}
			System.out.println ();
		}
		
	}
}
