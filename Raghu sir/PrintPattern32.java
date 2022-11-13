/*
E D C B A
D C B A
C B A 
B A
A
*/
import java.util.Scanner;
class PrintPattern32
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		for (int i=n;i>0 ;i--)
		{
			
			for (int j=i;j>0;j-- )
			{
				System.out.print((char)(64+j)+" ");
				
				
			}
			System.out.println();
			
		}
		
	}
}
