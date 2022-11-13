//define a method to return how many even and odd present in an array
import java.util.Scanner;
class Array5 
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
		int rs []=getEvenOdd(ar);
		
         System.out.println ("Even no..."+rs[0]);
		 System.out.println ("odd no..."+rs[1]);
	}
	public static int[] getEvenOdd(int ar[])
	{
		int ev=0,od=0;
	   for (int i=0;i<ar.length ;i++ )
	   {
          if (ar [i]%2==0)
          {
			  ev++;
          }
		  else
			  od++;
	   }
	   int count []={ev,od};
	   return count;
	}

}
