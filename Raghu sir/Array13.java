//wajp to add one array element inside another array from specified index
import java.util.Scanner;
class Array13 
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
		System.out.println ("Enter the index value");
		int in=sc.nextInt();
		int rs []=getAdded(ar1,ar2,in);
		for (int i=0;i<rs.length ;i++ )
		{
			System.out.print (rs[i]+" ");
		}
	}
	public static int [] getAdded (int [] a,int [] b,int in)
	{
	   if (in<0 || in>=a.length)
	   {
		   System.out.println ("Array index is out of range");
		   return a;
	   }
	   int c [] =new int [a.length+b.length];
	   for (int i=0;i<a.length ;i++ )
	   {
		   if (i<in)
		   {
			   c [i]=a [i];
		   }
		   else
		   {
		       c[i+b.length]=a [i];
		   }
	   }
	   for (int i=0;i<b.length ;i++ )
	   {
		   c [in+i]=b [i];
	   }
	   return c;

	}
}
