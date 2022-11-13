//wajp to print sum of digit
import java.util.Scanner;
class  Example27
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		getSumOfDigit(n);
		//System.out.println ("The sum of squareof digit are...."+rs);
	}
	public static void getSumOfDigit(int x)
	{
	    
		while (x!=0)
		{
			int d=x%10;
			System.out.print (d);
			x=x/10;
		}
		
	}
}
