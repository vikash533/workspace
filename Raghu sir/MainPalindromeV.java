//wajp to print all the 3 digit palindrome no.
class MainPalindromeV 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=9 ;i++ )
		{
			for (int j=0;j<=9 ;j++ )
			{
				System.out.println(i+""+j+""+i);
			}
		}
	}
}
