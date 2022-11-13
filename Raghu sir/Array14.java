import java.util.Scanner;
class Array14
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
		for (i=0;i<rs.length ;i++ )
		{
			System.out.print(rs [i]);
		}
	     
	}
	public static int[] getEvenOdd(int a[])
	{
        
	}
}