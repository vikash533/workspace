// define a method to convert all the vowel in the string to capital remaining all are in small
import java.util.Scanner;
class MainStr8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		getVowelCapital(str);
	}
	static void getVowelCapital(String str)
	{
		String v="aeiouAEIOU";
		char ch []=str.toCharArray();
		for (int i=0;i<ch.length ;i++ )
		{
			if (ch[i]>='a' && ch [i]<='z')
			{
				if (v.indexOf(ch[i])!=-1)
				{
					ch [i]=(char)(ch[i]-32);
				}
			}
			else if (ch[i]>='A' && ch [i]<='Z')
			{
				if (v.indexOf(ch[i])==-1)
				{
					ch [i]=(char)(ch[i]+32);
				}
			}
		}
		String s=new String (ch);
	   System.out.println (s);
	}
}