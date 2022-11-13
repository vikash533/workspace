//wajp to convert all the character of the string into capital letter
import java.util.Scanner;
class MainStr13
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER THE STRING VALUE : ");
		String str=sc.nextLine();
		String c=getCapital(str);
		System.out.println (c);
	}
	static String getCapital(String str)
	{
	   char ch []=str.toCharArray();
	   for (int i=0;i<ch.length ;i++ )
	   {
				if(ch [i]>='a' && ch [i]<='z')
					ch [i]=(char)(ch[i]-32);
	   }
	   String s=new String (ch);
	   return s;
	}

}
