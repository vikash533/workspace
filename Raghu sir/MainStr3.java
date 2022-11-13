//define a method to return how many vowels are present in a String
import java.util.Scanner;
class  MainStr3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		int number=countVowel(str);
		System.out.println ("Number of vowel present is...."+number);
	}
	static int countVowel(String str)
	{
		int count=0;
	    String v="AEIOUaeiou";
		for (int i=0;i<str.length() ;i++ )
		{
			char ch=str.charAt(i);
			if (ch=='A'||ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u'  )
			{
				count++;
			}
		}
		return count;
	}
}
