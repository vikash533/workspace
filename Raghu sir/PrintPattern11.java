/*1
  00
  111
  0000
  11111*/
import java.util.Scanner;
class PrintPattern11
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
                System.out.print (i%2+"");
			
				
				
			}
			System.out.println ();
		}
		
	}
}
