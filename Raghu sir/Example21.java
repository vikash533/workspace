//wajp to print sum of even and odd no within n
import java.util.Scanner;
class Example21 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rs=getEven(n);
		int pq=getOdd(n);
		System.out.println ("sum of even no. is..."+rs);
		System.out.println ("sum of odd no. is..."+pq);
	}
	public static int getEven(int n)
	{
		int sum=0;
	   for (int i=2;i<=n ;i++ )
	   {
		   if (i%2==0)
		   {
                sum=sum+i;
		   }
	   }
	   return sum;
	}
	public static int getOdd(int n)
	{
	  int sum=0;
	  for (int i=1;i<=n ;i++ )
	  {
		  if (i%2!=0)
		  {
			  sum=sum+i;
		  }
	  }
	  return sum;
	}
}
