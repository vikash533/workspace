/*
ABCDEDCBA
 BCDEDCB
  CDEDC
   DED
    E
*/
import java.util.Scanner;
class PrintPattern48
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
        int sp=0,st=2*n-1;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=sp ;j++ )
			{
				System.out.print(" ");
			}
			int x=2*i-1;
			for (int j=i;j<=st ;j++ )
			{
				System.out.print(x);
				if(j<n)
					x++;
				else
					x--;
			}
			System.out.println();
			sp++;
			st=st-2;
		}
	}

}