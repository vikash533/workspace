//wajp to define a method to return the difference of sum of even and odd digit
import java.util.Scanner;
class MainDiff 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rs=getEOD(n);
		System.out.println (rs);
	}
	public static int getEOD(int n)
	{
		int sum=0,dif=0;
	   do
	   {
		   int d=n%10;
		   if (d%2==0)
		   {
			   sum=sum+d;
		   }
		   else 
			   dif=dif+d;

		   n=n/10;
	   }
	   while (n!=0);
	
	   return sum-dif;
	}
}
