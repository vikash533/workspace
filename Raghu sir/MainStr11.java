// wajp to swap every weord first character with the same word last character
import java.util.Scanner;
class MainStr11
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER THE STRING VALUE : ");
		String str=sc.nextLine();
		String c=swap(str);
		System.out.println (c);
	}
	static String swap(String str)
	{
	   char ch []=str.toCharArray();
	   int f=0;
	   for (int i=0;i<ch.length ;i++ )
	   {
		    if (i==0 && ch[i]!=' ' || ch[i]!=' '&& ch[i-1]==' ')
		    {
				f=i;
		    }
			else if (i==ch.length-1 && ch[i]!='0' || ch [i]!=' '&& ch[i+1]==' ')
			{
				char temp=ch[i];
				ch[i]=ch[f];
				ch[f]=temp;
			}
	   }
	   String s=new String (ch);
	   return s;
	}

}
