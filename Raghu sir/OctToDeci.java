//wajp to convert octal to decimal
import java.util.Scanner;
class OctToDeci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the octal no.");
		int n=sc.nextInt();
		int rs=getDecimal(n);
		System.out.println ("The decimal no is..."+rs);
	}
	public static int getDecimal(int n)
	{
	  int count=0;
	  int sum=0;
	  do
	  {
		  
		  int d=n%10;
          sum=sum+d*pow(8,count);
		  count++;
		  n=n/10;
	  }
	  while (n!=0);
	  return sum;
	}
	public static int pow(int d,int count)
	{
	  int pw=1;
	  while (count>0)
	  {
		  pw=pw*d;
		  count--;
	  }
	  return pw;
	}
}
