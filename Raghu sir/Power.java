//wajp to print n^p
import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println ("Enter the number first then power");
		int n=sc.nextInt();
		int p=sc.nextInt();
		int rs=getPow(n,p);
		System.out.println ("tHE VALUE OF N^p is.."+rs);
	}
	public static int getPow(int n,int p)
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
