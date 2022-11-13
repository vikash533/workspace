/*
ABCDE
 BCDE
  CDE
   DE
    E
*/
import java.util.Scanner;
class PrintPattern50
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
         int sp=0;
		 for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=sp ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=i;j<=n ;j++ )
			{
				System.out.print((char)(64+j));
			}
			System.out.println();
			sp++;
			
		}
	}

}