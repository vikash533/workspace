//wajp to convert decimal to hexadecimal
import java.util.Scanner;
class DeciToHexa 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("EWnter the decimal number");
		int n=sc.nextInt();
		String rs=getHexadecimal(n);
		System.out.println(rs);
	}
	public static String getHexadecimal(int n)
	{
	   String hexa="";
	   do
	   {
		   int d=n%16;
		   if (d<10)
		   hexa=d+hexa;
		   else
			   hexa=(char)(55+d)+hexa;
		   n=n/16;
	   }
	   while (n!=0);
	   return hexa;
	}
}
