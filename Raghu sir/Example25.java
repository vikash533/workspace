//wajp to define a method to print how many even and odd digit present in the no.
import java.util.Scanner;
class  Example25
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the no.");
		int n=sc.nextInt();
		getEvenOdd(n);
	}
	public static void getEvenOdd(int n)
	{
		int count=0;
		int print=0;
	    for (int i=1;i<=n ;i++ )
	    {
			if (i%2==0)
			{
				count++;
			}
			else
				print++;
	    }
		System.out.println ("The number of even number is..."+count);
		System.out.println ("The number of even number is..."+print);
	}
}
