/*
543212345
 4321234
  32123
   212
    1
*/
import java.util.Scanner;
class PrintPattern55
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
        int sp=0,st=2*n-1;
		for (int i=n;i>0 ;i--)
		{
			for (int j=1;j<=sp ;j++ )
			{
				System.out.print(" ");
			}
			int x=i;
			for (int j=1;j<=st ;j++ )
			{
				System.out.print(x);
				if(j<=st/2)
					x--;
				else
					x++;

			}
			System.out.println();
			sp++;
			st=st-2;
		}
	}

}