/*ABCDE
  BCDE
  CDE
  DE
  E*/
import java.util.Scanner;
class PrintPattern18
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("enter the number");
		int n=sc.nextInt();
		int j=1;
		for (int i=1;i<=n ;i++ )
		{
		  for ( j=i;j<=n ;j++)
		  {
             System.out.print((char)(64+j)+"");

			 
		  }
			System.out.println ();
		}
		
	}
}
