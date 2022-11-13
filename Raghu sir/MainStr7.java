//define a method to convert all the character in the string to lowercase
import java.util.Scanner;
class MainStr7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		getLowerCase(str);
	}
	static void getLowerCase(String str)
	{
		char ch []=str.toCharArray();
	   for (int i=0;i<ch.length ;i++ )
	   {
		   if (ch [i]>='A'&& ch [i]<='Z')
		   {
			   ch[i]=(char)(ch[i]+32);
		   }
	   }
	   String rev=new String(ch);
	   System.out.println (rev);
	}
}
