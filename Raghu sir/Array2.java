//define a method to return how many prime no. present in an array
import java.util.Scanner;
class Array2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int ar []=new int [n];
		System.out.println ("Enter "+n+" values");
		for (int i=0;i<n ;i++ )
		{
			ar [i]=sc.nextInt();
		}
		int rs=getPrime(ar);
         System.out.println ("Number of prime no. is..."+rs);
	}
	public static int getPrime(int ar [])
	{
		int count=0;
	   for (int i=0;i<ar.length;i++ )
	   {
		   boolean rs=isPrime (ar[i]);
		   if (rs==true)
		   {
			   count++;
		   }
	   }
	   return count;
	}
	public static boolean isPrime(int x)
	{
		boolean b=true;
	   for (int i=2;i<=x/2 ;i++ )
	   {
		   if (x%i==0)
		   {
			   return false;
		   }
	   }
	   return true;
	}
}
