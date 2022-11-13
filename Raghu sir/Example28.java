//define a method to return true if no. is diserium number
import java.util.Scanner;
class Example28
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the given number");
        int n=sc.nextInt();
		boolean rs=isDiserium(n);
		if (rs==true)
		System.out.println ("Diserium  number");
		else
			System.out.println ("Not a Diserium number");
	}
	public static boolean isDiserium(int n)
	{
	    int sum=0,temp=n;
		do
		{
			int p=count(n);
			int d=n%10;
			sum=sum+pow(d,p);
			n=n/10;
		}
		while (n!=0);
		return sum==temp;
	}
	public static int count(int n)
	{
	   int cnt=0;
		   do
		   {
		      cnt++;
			  n=n/10;
		   }
		   while (n>0);
		   return cnt;
	}
	public static int pow(int d,int p)
	{
	    int pw=1;
		while (p>0)
		{
			pw=pw*d;
			p--;
		}
		return pw;
	}
}
