//wajp to convert decimal to Binary
import java.util.Scanner;
class DeciToBin
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the decimal number");
		int n=sc.nextInt();
		String rs=getDecToBin(n);
		System.out.println (rs);
	}
	public static String getDecToBin(int n)
	{
		String bin="";
	    do
	    {
			int d=n%2;
			bin=d+bin;
            n=n/2;

	    }
	    while (n!=0);
		return bin;
	}
}
