import java.util.Scanner;
class ArrayOperation
{
	 public  int [] readArray()
	{
		 Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int [] ar=new int[n];
		System.out.println ("enter "+n+" values");
		for (int i=0;i<n ;i++ )
		{
			ar [i]=sc.nextInt();
		}
		return ar;
	}
	public  void displayArray(int ar [])
	{
		for (int i=0;i<ar.length ;i++ )
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println ();
	
	}
	public  int getBiggest(int ar [])
	{
	   int big=ar[0];
	   for (int i=1;i<ar.length ;i++ )
	   {
		   if(ar[i]>big)
			   big=ar[i];
	   }
	   return big;
	}
	public  int getSmallest(int ar[])
	{
	   int small=ar[0];
	   for (int i=1;i<ar.length ;i++ )
	   {
		   if (ar[i]<small)
		   {
			   small=ar[i];
		   }
		   
	   }
	   return small;
	}
}
