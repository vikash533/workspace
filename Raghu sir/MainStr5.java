//define a method to return true if the string is palindrome
import java.util.Scanner;
class MainStr5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		boolean rs=isPalindrome(str);
		 if(rs==true)
			 System.out.println ("String is Palindrome");
		 else
			System.out.println ("Not a Palindrome");
	}
	static boolean isPalindrome(String str)
	{
	   int i=0,j=str.length()-1;
	   while (i<j)
	   {
		   if (str.charAt(i)!=str.charAt(j))
		   {
			   return false;
		   }
		   i++;
		   j--;
	   }
	   return true;
	}
}
