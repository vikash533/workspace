// wajp to print factorial of n
import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println ("Enter the value of n");
		int n=sc.nextInt();
		int rs=getFact(n);
		System.out.println ("Factorial of the given number is..."+rs);
	}
	public static int getFact(int n)
	{
	    int fact=1;
		for (int i=1;i<=n ;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
