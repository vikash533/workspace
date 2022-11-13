//wajp to define a method to merge two array elements into a single array in zig zag order
import java.util.Scanner;
class Array9 
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
	   int in [] =new int[ar1.length+ar2.length];
	   int i=0,k=0;
	    while (i<ar1.length && i<ar2.length)
	    {
			in [k]=ar1 [i];
			k++;
			in [k]=ar2 [i];
			k++;
			i++;
	    }
		while (i<ar1.length)
		{
			in [k]=ar1 [i];
			k++;
			i++;
		}
		while (i<ar2.length)
		{
			in [k]=ar2 [i];
			k++;
			i++;
		}
	   return in;
	}
}
