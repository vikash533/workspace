//wajp to print sum of digit
import java.util.Scanner;
class  MainDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rs=getSumOfDigit(n);
		System.out.println ("The sum of digit are...."+rs);
	}
	public static int getSumOfDigit(int x)
	{
	    int sum=0;
		while (x!=0)
		{
			int d=x%10;
			sum=sum+d;
			x=x/10;
		}
		return sum;
	}
}
