//define a method to return Xylem if no is xylem otherwise return pholem
import java.util.Scanner;
class Example29
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the given number");
        int n=sc.nextInt();
		boolean rs=isXP(n);
		if (rs==true)
		System.out.println ("Xylem number");
		else
			System.out.println ("Phloem number");
	}
	public static boolean isXP(int n)
	{
	    int sum=0,e=0,temp=n;
		do
		{
            int d=n%10;
			sum=sum+d;
			if (d/10==0)
			{
				e=d;
			}
			n=n/10;
		}
		while (n!=0);
		//System.out.println (e);
		int f=temp%10;
		int g=e+f;
		 sum=sum-g;
		 return sum==g;
	}
}