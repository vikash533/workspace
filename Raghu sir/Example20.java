//wajp to return true if no is prime
import java.util.Scanner;
class Example20 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean rs=getPrime(n);
		System.out.println(" the prime number is.. "+rs);
	}
	public static boolean getPrime(int n)
	{
		boolean b=true;
	    for (int i=2;i<=n/2 ;i++ )
	    {
			
			if (n%i==0)
			{
                b=false;
				
			}
			
	    }
			return b;
	}
}
