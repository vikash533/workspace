//wajp to convert every word first chareacter into capital and remaining all tro small
import java.util.Scanner;
class MainStr9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER THE STRING VALUE : ");
		String str=sc.nextLine();
		String c=getFirstWordCapital(str);
		System.out.println (c);
	}
	static String getFirstWordCapital(String str)
	{
	   char ch []=str.toCharArray();
	   for (int i=0;i<ch.length ;i++ )
	   {
		    if (i==0 && ch[i]!=' ' || ch[i]!=' '&& ch[i-1]==' ')
		    {
				if(ch [i]>='a' && ch [i]<='z')
					ch [i]=(char)(ch[i]-32);
		    }
			else if (ch [i]<='A' && ch [i]>='Z')
			{
				ch [i]=(char)(ch[i]+32);
			}
	   }
	   String s=new String (ch);
	   return s;
	}

}
