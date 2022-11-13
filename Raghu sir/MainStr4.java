// define a method to return how many special character present in a string 
import java.util.Scanner;
class MainStr4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int number=countSpecialCharacter(str);
		System.out.println ("Number of special character is..."+number);
	}
	static int countSpecialCharacter(String str)
	{
		int count=0;
		for (int i=0;i<str.length() ;i++ )
		{
			 char ch=str.charAt(i);
		/*	if ((ch>=32 && ch<=47) || (ch>=58 && ch<=64) || (ch>=91 && ch<=96) || (ch>=123 && ch<=126))
			{
				count++;
			} */    
		    if (ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9')
		    {
				continue;
		    }
			else count++;
		}
		return count;
	}
}
