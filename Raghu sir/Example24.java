//wajp to print sum of digit
import java.util.Scanner;
class  Example24
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rs=getSumOfDigit(n);
		System.out.println ("The Product of  digit are...."+rs);
	}
	public static int getSumOfDigit(int x)
	{
	    int pro=1;
		while (x!=0)
		{
			int d=x%10;
			pro=pro*d;
			x=x/10;
		}
		return pro;
	}
}
