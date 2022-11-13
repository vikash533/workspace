//wajp to define a method to reverse the array elements
import java.util.Scanner;
class Array4 
{
	public static void reverse(int x [])
	{
		int i=0,j=x.length-1;
		while (i<j)
		{
			int temp=x[i];
			x[i]=x[j];
			x[j]=temp;
			i++;
			j--;
		}
		
	}
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
		System.out.println ("Array before reverse");
		for (int i=0;i<ar.length ;i++ )
		{
            System.out.print(ar[i]+" ");
		}
         System.out.println ();
		
		  reverse(ar);
		  System.out.println ("Array after the Reverse");
		  for (int i=0;i<ar.length ;i++ )
		  {
			  System.out.print(ar[i]+" ");
		  }

	}
}
