//wajp to print no of even digit
import java.util.Scanner;
class  MainEven
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		printCountEO(n);
	}
	public static void printCountEO(int n)
	{
	    int ec=0,oc=0;
        do
        {
			int d=n%2;
			if (d%2==0)
			{
				ec++;
			}
			else 
				oc++;
			n=n/10;
        }
        while (n!=0);
		System.out.println ("Number of even digit :"+ec);
		System.out.println ("Number of odd digit :"+oc);

	}
}
