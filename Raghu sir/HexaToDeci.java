//wajp to convert hexadecimal to decimal
import java.util.Scanner;
class HexaToDeci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);

		System.out.println("Enter hexadecimal no");
		int n=sc.nextInt();
		int rs=getDecimal(n);
		System.out.println (rs);
	}
	public static int getDecimal(int n)
	{
		int sum=0,count=0;
	   do
	   {
		   
          int d=n%10;
		  if(d<10)
		   {
		  sum=sum+d*pow(16,count);
		  count++;
		   }
		   else if(d=='B')
		   {
		     sum=sum+(d-55)*pow(16,count);
			 count++;
		   }
		  n=n/10;
	   }
	   while (n!=0);
	   return sum;
	}
	public static int pow(int n,int p)
	{
	   int pw=1;
	   while (p>0)
	   {
		   pw=pw*n;
		   p--;
	   }
	   return pw;
	}
}
