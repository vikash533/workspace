import java.util.Scanner;
class Mainstrong1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the given number");
        int n=sc.nextInt();
		boolean rs=isStrong(n);
		if (rs==true)
		System.out.println ("STRONG NUMBER");
		else
			System.out.println ("Not a strong no.");
	}
	public static boolean isStrong(int n)
	{
		int sum=0,temp=n;
	    do
	    {
          int d=n%10;
		  sum=sum+fact(d);
		  n=n/10;
	    }
	    while (n!=0);
		return sum==temp;
	}
	public static int fact(int d)
	{
	  int prop=1;
	  while (d>0)
	  {
		  prop=prop*d;
		  d--;
	  }
	  return prop;
	}
}