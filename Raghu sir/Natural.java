// Define a method to return sum of natural number
import java.util.Scanner;
class  Natural
{
    public static int sumOfNatural(int n)
   {
      
	  int sum=0;
	  for (int i=1;i<=n ;i++ )
	  {
		  sum=sum+i;
	  }
	 return sum;
   }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter the number");
		int n=sc.nextInt();
		int s1=sumOfNatural(n);
		System.out.println ("Enter the number..."+s1);

	}
}
