// wajp to print perfect no. within n
import java.util.Scanner;
class Example35 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println ("Enter the number");
		int n=sc.nextInt();
		for (int i=1;i<=n ;i++ )
		{
			boolean rs=getPerfectNumber(i);
			if (rs==true)
			{
				System.out.println (i);
			}
		}
		
	}
	public static boolean getPerfectNumber(int n)
	{
	  int sum=0;
	  for (int i=1;i<=n/2 ;i++ )
	  {
		  if (n%i==0)
		  {
			  sum=sum+i;
		  }
	  }
	  return sum==n;
	}
}
