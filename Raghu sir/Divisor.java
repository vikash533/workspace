//wajp to define a method how many divisor are there
import java.util.Scanner;
class Diviser 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rs=getDiv(n);
		System.out.println("The no of divisor are..."+rs);
	}
	public static int getDiv(int n)
	{
	     int div=0;
		 for (int i=1;i<=n ;i++ )
		 {
			 if (n%i==0)
			 {
				 div=div+1;
			 }
		 }
		 return div;
	}
}
