//wajp to define a method to return sum of divisor
import java.util.Scanner;
class Example18 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rs=getSumOfDivisor(n);
		System.out.println ("The sum of Divisor is..."+rs);
	}
	public static int getSumOfDivisor(int n)
	{
	    
		int sum=0;
		for (int i=1;i<=n/2 ;i++ )
		{
			if (n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum+n;
	}
}
