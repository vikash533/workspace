// wajp delete the element from the array from the specified index
import java.util.Scanner;
class Array11  
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
		System.out.println ("Enter the index value");
		int in=sc.nextInt();
		int rs []=getDeleted(ar1,in);
		for (int i=0;i<rs.length ;i++ )
		{
			System.out.print (rs [i]+" ");
		}
	}
	public static int [] getDeleted (int [] ar,int in)
	{
		if (in<0 || in>=ar.length)
		{
			System.out.println ("Array is not in the range");
			return ar;
		}
		int [] a =new int [ar.length-1];
		int i=0;
	   while (i<a.length)
	   {
		   if (i<in)
		   {
		   a [i]= ar [i];
		   i++;
		   }
		   else
		   {
		      a [i]=ar [i+1];
			  i++;
		   }
	   }
	   return a;
	}
}
