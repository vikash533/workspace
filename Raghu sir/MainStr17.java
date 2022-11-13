//wajp to check user entered no is panagram or not
import java.util.Scanner;
class MainStr17
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER THE STRING VALUE : ");
		String str=sc.nextLine();
		boolean rs=isPanagram(str);
		if(rs==true)
			System.out.println("panagram");
		else
			System.out.println ("not a panagram");
	}
	static boolean isPanagram(String str)
	{
	   str.toLowerCase();
	   for (char ch='a';ch<='z' ;ch++ )
	   {
		   if (str.indexOf(ch)==-1)
			   return false;
		   
	   }
	   return true;
	}

}
