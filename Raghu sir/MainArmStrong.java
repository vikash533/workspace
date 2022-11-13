//wajp to define a method to returen true if the no is armstrong no.
import java.util.Scanner;
class MainArmStrong
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the given number");
        int n=sc.nextInt();
		boolean rs=isArm(n);
		if (rs==true)
		System.out.println ("ARMSTRONG NUMBER");
		else
			System.out.println ("NOT A Armstrong no");
	}
	public static boolean isArm(int n)
	{
	     int sum=0,fact=n;
		 int dc=countDigit(n);
		 do{
		     int d=n%10;
			 sum=sum+pow(d,dc);
			 n=n/10;
		   }while(n!=0);
		   
		   return sum==fact;
	}
	public static int countDigit(int n)
	{
		int count=0;
	    do{
			count++;
            n=n/10;
	    }while (n!=0);
	    
		return count;
	}
	public static int pow(int d,int dc)
	{
	   int pw=1;
	   while (dc>0)
	   {
		   pw=pw*d;
		   dc--;
	   }
	   return pw;
	}
}