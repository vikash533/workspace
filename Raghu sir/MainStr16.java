// wajp to print the frequency of each character into given String irrespective of case
import java.util.Scanner;
class MainStr16
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER THE STRING VALUE : ");
		String str=sc.nextLine();
		int count []=new int [26];
		for (int i=0;i<str.length() ;i++ )
		{
		    char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
				count[ch-97]++;
			else if(ch>='A' && ch<='Z')
				count[ch-65]++;
		}
		for (int i=0;i<26 ;i++ )
		{
			if(count [i]!=0)
				System.out.println ((char)(i+65)+"..."+count[i]);
		}
	}

}
