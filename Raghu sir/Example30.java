//define a method to return avg of a digit
import java.util.Scanner;
class Example30
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the given number");
        int n=sc.nextInt();
		double rs=average(n);
	    System.out.println ("The average of the digit is:"+rs);
	}
	public static double average(int n)
	{
	    double sum=0;
		int temp=n;
		do
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		while (n!=0);
		double avg=sum/count(temp);//int/int==int with double 
		return avg;
	}
	public static int count (int n)
	{
		int cnt=0;
	    do
	    {
			cnt++;
			n=n/10;

	    }
	    while (n!=0);
		return cnt;
	}
}