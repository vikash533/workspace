import java.util.Scanner;
class MainPrimeV 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		for (int i=1;i<=n ;i++ )
		{
			int sum=0;
			for (int j=2;j<=i/2 ;j++ )
			{
				
				if (i%j==0)
				{
					sum++;
				}
			}
			if (sum==0)
			{
				System.out.println (i);
			}
		}
	}
}
