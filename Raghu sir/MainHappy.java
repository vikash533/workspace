//wajp to define a method to return true if the no. happy
import java.util.Scanner;
class MainHappy 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in); 
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean rs=isHappy(n);
		if (rs==true)
		{
			System.out.println ("Happy number");
		}
		else
			System.out.println ("Not a happy number");
	}
	public static boolean isHappy(int n)
	{
	   while (n>9)
	   {
		   int sum=0;
		   do
		   {
			   int d=n%10;
			   sum=sum+d*d;
			   n=n/10;

		   }
		   while (n!=0);
		   n=sum;
	   }
	   return n==1||n==7;
	}
}
