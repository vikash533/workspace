//define a method to return true for the perfect no.
import java.util.Scanner;
class Example19 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number...");
		int n=sc.nextInt();
		boolean rs=getPerfect(n);
		System.out.println("Result of perfect no. is..."+rs);
	}
	public static boolean getPerfect(int n)
	{
	    int sum=0;
		for (int i=1;i<=n/2 ;i++ )
		{
			if (n%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum==n)
		{
			return true;
		}
		else
			return false;
	}
}
