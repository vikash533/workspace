// define a method to return sum of digit from the given string
import java.util.Scanner;
class  MainStr2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int sum=getSum(str);
		System.out.println ("Sum of digit in a String is..."+sum);
	}
	static int getSum(String str)
	{
		int sum=0;
	    for (int i=0;i<str.length() ;i++ )
	    {
			char ch=str.charAt(i);
			if (ch>='0' && ch<='9')
			{
                sum=sum+ch-48;
			}
	    }
		return sum;
	}
}
