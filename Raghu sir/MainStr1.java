// wajp to print how many vowel,consonent,capital letter,small letter,digit,special character
import java.util.Scanner;
class MainStr1  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();//Java8 JDK1.8
		int vc=0,cc=0,uc=0,lc=0,dc=0,spc=0;
		for (int i=0;i<str.length() ;i++ )
		{
            char ch=str.charAt(i);
			if (ch>='A' && ch<='Z')
			{
				uc++;
				if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					vc++;
				}
				else
					cc++;

			}
			else if (ch>='a' && ch<='z')
			{
				lc++;
				if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vc++;
				}
				else
					cc++;
			}
			else if (ch>='0' && ch<='9')
			{
				dc++;
			}
			else 
				spc++;
		}
         System.out.println("no. of capital letter "+uc);
		 System.out.println("no. of small letter "+lc);
		 System.out.println("no. of vowel letter "+vc);
		 System.out.println("no. of consonent letter "+cc);
		 System.out.println("no. of digit letter "+dc);
		 System.out.println("no. of special character "+spc);
	}
}