//wajp to print palindrome no within 1000
class Example31 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=1000 ;i++ )
		{
			boolean rs=isPalindrome(i);
			if (rs==true)
			{
				System.out.println (i);
			}
		}
		
	}
	public static boolean isPalindrome(int n)
	{
	     int reverse=0,temp=n;
		 do
		 {
			 int d=n%10;
             reverse=reverse*10+d;
			 n=n/10;
		 }
		 while (n!=0);
	   return reverse==temp;
	}
}
