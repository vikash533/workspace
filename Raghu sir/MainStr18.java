//wajp to check user entered no is anagram or not
import java.util.Scanner;
class MainStr18
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER THE  first STRING VALUE : ");
		String str1=sc.nextLine();
		System.out.println("ENTER THE  second STRING VALUE : ");
		String str2=sc.nextLine();
		boolean rs=isPanagram(str1 ,str2);
		if(rs==true)
			System.out.println("anagram");
		else
			System.out.println ("not a anagram");
	}
	static boolean isPanagram(String str1, String str2)
	{
	   int count1 []=new int [26];
	   int count2 []=new int [26];
	   for (int i=0;i<str1.length() ;i++ )
	   {
		   char ch=str1.charAt(i);
		   if (ch >='A' && ch<='Z')
		   {
			   count1 [ch-65]++;

		   }
		   else if(ch>='a' && ch<='z')
			   count1[ch-97]++;
	   }
	   for (int i=0;i<str2.length() ;i++ )
	   {
          char ch=str2.charAt(i);
		   if (ch >='A' && ch<='Z') 
		   {
			   count2 [ch-65]++;

		   }
		   else if(ch>='a' && ch<='z')
			   count2 [ch-97]++;

	   }
	   for (int i=0;i<26 ;i++ )
	   {
		   if(count1 [i]!=count2 [i])
			   return false;
	   }
	   return true;
	}

}
