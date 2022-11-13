//wajp to define a method to merge two sorted array elements into a single sorted array 
import java.util.Scanner;
class Array10
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int ar1 []=new int [n];
		System.out.println ("Enter "+n+" values of first array");
		for (int i=0;i<ar1.length ;i++ )
		{
			ar1 [i]=sc.nextInt();
		}
		System.out.println ("Enter the size of second array");
		int a=sc.nextInt();
		int ar2 []= new int [a];
		System.out.println ("Enter the "+a+" values of second array");
		for (int i=0;i<ar2.length ;i++ )
		{
			ar2 [i]=sc.nextInt();
		}
		int in []=getMerged(ar1,ar2);
		for (int i=0;i<in.length ;i++ )
		{
			System.out.print (in[i]+" ");
		}
	}
	public static int [] getMerged(int ar1 [],int ar2 [])
	{
		int i=0,j=0,k=0;
	   int in [] =new int[ar1.length+ar2.length];
	   while (i<ar1.length && j<ar2.length)
	   {
		   if (ar1 [i]<ar2 [j])
		   {
			   in [k++]=ar1 [i++];
			   
		   }
		   else
		   {
		      in [k++]=ar2 [j++];
		   }
		   
	   }
	   while (i<ar1.length)
	   {
		   in [k++]=ar1 [i++];
	   }
	   while (j<ar2.length)
	   {
		   in [k++]=ar2 [j++];
	   }
	   return in;
	}
}
