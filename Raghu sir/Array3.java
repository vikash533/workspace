//wajp to define a method to return the product of an element
import java.util.Scanner;
class Array3 
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
		int rs=getProduct(ar);
         System.out.println ("the product is"+rs);

	}
	public static int getProduct(int ar [])
	{
		int pr=1;
	   for (int i=0;i<ar.length ; i++)
	   { 
		   pr=pr*ar[i];

	   }
	   return pr;
	}
}
