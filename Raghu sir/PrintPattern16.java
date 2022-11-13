/*55555
  44444
  33333
  22222
  11111*/
import java.util.Scanner;
class PrintPattern16
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("enter the number");
		int n=sc.nextInt();
		for (int i=5;i>0 ;i-- )
		{
			for (int j=1;j<=n ;j++ )
			{
				
                System.out.print (i+"");
			    
				
				
			}
			System.out.println ();
			
		}
		
	}
}
