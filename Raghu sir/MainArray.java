import java.util.Scanner;
class MainArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		int ar []=new int [n];
		System.out.println (ar);
		System.out.println ("Array size is ..."+ar.length);
		System.out.println ("Enter "+n+"value");
		for (int i=0;i<n ;i++ )
		{
			ar[i]=sc.nextInt();
		}
		System.out.println ("user enter value from first to last");
		for (int i=0;i<ar.length ;i++ )
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println ();
		System.out.println ("User enter array from first to last");
		for (int i=ar.length-1;i>=0 ;i-- )
		{
			System.out.print(ar[i]+" ");
		}
	}
}
