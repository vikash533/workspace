//Define a method to return sum of array Elements
import java.util.Scanner;
class Array1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		int ar []=new int [n];
		System.out.println ("Enter "+n+"values");
		for (int i=0;i<n ;i++ )
		{
			ar[i]=sc.nextInt();
		}
		int sum=sumOfArray(ar);
		System.out.println ("Sum of array is..."+sum);
	}
	public static int sumOfArray(int x [])
	{
	   int total=0;
	   for (int i=0;i<x.length ;i++ )
	   {
		   total=total+x[i];
	   }
	   return total;
	}
}
