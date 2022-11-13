//wajp to define a method to every array elements replaced by sum of digit
import java.util.Scanner;
class Array6 
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
		getDigit(ar);
		for (int i=0;i<ar.length ;i++ )
		{
			System.out.print(ar[i]+" ");
		}
	}
     public static void getDigit(int ar [])
	{
 
	   for (int i=0;i<ar.length ;i++ )
	   {    int sum=0;
		   do
		   {
			   int d=ar[i]%10;
			   sum=sum+d;
			   ar[i]=ar[i]/10;
		   }
		   while (ar[i]!=0);
		   ar[i]=sum;
		   
	   }
	 }
}
