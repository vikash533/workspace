//wajp to reverse the word in a se3ntence
import java.util.Scanner;
class MainStr19
{
	public static void main (String [] args)
	{
	  Scanner sc=new Scanner (System.in);
	  System.out.println ("Enter the string");
	  String str=sc.nextLine();
	  String rs=reverseEachWord(str);
	  System.out.println (rs);
	}
	static String reverseEachWord(String str)
	{
	   char ch []=str.toCharArray();
	   str="";
	   for (int i=0;i<ch.length ;i++ )
	   {
		   int k=i;
		   while (i<ch.length && ch [i]!=' ')
		   {
			   i++;
		   }
		   int j=i-1;
		   while (j>=k)
		   {
			   str=str+ch[j];
			   j--;
		   }
		   if(i<ch.length)
			   str=str+ch[i];
	   }
	   return str;
	}
}