//wajp to define a method to search the elements from an array if it is present return the index of the element otherwise return -1
import java.util.Scanner;
class Array7  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int ar []=new int [n];
		System.out.println ("Enter "+n+" value");
		for (int i=0;i<n ;i++ )
		{
			ar [i]=sc.nextInt();
		}
		System.out.println ("Enter the array element which you want top check");
		int element=sc.nextInt();
		 int rs=getIndex(ar,element);
		 if(rs==-1)
		 System.out.println ("Array elements not present");
		 else
			 System.out.println ("Array element index is ...."+rs);
	}
	public static int getIndex(int ar [],int element)
	{
		
	    for (int i=0;i<ar.length ;i++ )
	    {
			if(ar [i]==element)
				return i;
	    }
		 return -1; 
	}
}
