/*
    1
   212
  32123
 4321234
  32123
   212
    1
*/
import java.util.Scanner;
class PrintPattern56
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
        int sp=n/2,st=1;
         for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=sp ;j++ )
			{
				System.out.print(" ");
			}
			int x=st/2+1;
			for (int j=1;j<=st ;j++ )
			{
				System.out.print(x);
				if (j<=st/2)
					x--;
				else
					x++;
			}
			System.out.println();	
			if (i<=n/2)
			{
				sp--;
				st=st+2;
			}
			else
			{
			    sp++;
				st=st-2;
			}
		}
	}

}