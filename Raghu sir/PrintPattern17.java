/*10101
  01010
  10101
  01010
  10101*/
import java.util.Scanner;
class PrintPattern17
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("enter the number");
		int n=sc.nextInt();
		for (int i=1;i<=n ;i++ )
		{
			if(i%2!=0)
            {
			for (int j=1;j<=n ;j++ )
			{
		        System.out.print (j%2+"");	
			}
			}
			else
				{
			for (int j=2;j<=n+1 ;j++ )
			{
		        System.out.print (j%2+"");	
			}
			    }
			System.out.println ();
			
		}
		
	}
}
