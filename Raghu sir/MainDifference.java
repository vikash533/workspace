//wajp to find the difference between biggest and smallest digit
import java.util.Scanner;
class  MainDifference 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rs=getDifference(n);
		System.out.println ("The difference between greatest and smallest digit :"+rs);
	}
	public static int getDifference(int n)
	{
	    int big,small;
		big=small=n%10;
		while (n!=0)
		{
			int d=n%10;
			if (d>big)
			{
				big=d;
			}
			if (d<small)
			{
				small=d;
			}
			n=n/10;
		}
		return big-small;
	}
}
