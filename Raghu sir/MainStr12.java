// wajp to return how many words present in a sentence
import java.util.Scanner;
class MainStr12
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER THE STRING VALUE : ");
		String str=sc.nextLine();
		int c=countWord(str);
		System.out.println (c);
	}
	static int countWord(String str)
	{
	   char ch []=str.toCharArray();
	   int count =0;
	   for (int i=0;i<ch.length ;i++ )
	   {
		    if (i==0 && ch[i]!=' ' || ch[i]!=' '&& ch[i-1]==' ')
		    {
				count++;
		    }
	   }
	   return count;
	}

}
