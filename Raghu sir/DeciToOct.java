//wajp to convert decimal to octal
import java.util.Scanner;
class DeciToOct
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the decimal number");
		int n=sc.nextInt();
		String rs=getDecToOct(n);
		System.out.println (rs);
	}
	public static String getDecToOct(int n)
	{
		String oct="";
	    do
	    {
			int d=n%8;
			oct=d+oct;
                        n=n/8;

	    }
	    while (n!=0);
		return oct;
	}
}
