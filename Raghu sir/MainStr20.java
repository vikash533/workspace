 //wajp to reverse the the sentence
import java.util.Scanner;
class MainStr20
{
	public static void main (String [] args)
	{
	  Scanner sc=new Scanner (System.in);
	  System.out.println ("Enter the string");
	  String str=sc.nextLine();
	  String rs=reverseSentence(str);
	  System.out.println (rs);
	}
	static String reverseSentence(String str)
	{
	   char ch []=str.toCharArray();
	   str="";
	   for (int i=ch.length-1;i>0 ;i-- )
	   {
		   int k=i;
		   while (i>=0 && ch [i]!=' ')
		   {
			   i--;
		   }
		   int j=i+1;
		   while (j<=k)
		   {
			   str=str+ch[j];
			   j++;
		   }
		   if(i>=0)
			   str=str+ch[i];
	   }
	   return str;
	}
}