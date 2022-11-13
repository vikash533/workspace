//define a method to return true if the no. is palindrome
import java.util.Scanner;
class MainPalindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the given number");
        int n=sc.nextInt();
		boolean rs=isPalindrome(n);
		if (rs==true)
		System.out.println ("Palindrome number");
		else
			System.out.println ("Not a palindrome number");
	}
	public static boolean isPalindrome(int n)
	{
	    int sum=0,temp=n;
		do{
		    int d=n%10;
			sum=sum*10+d;
			n=n/10;
		  }while (n!=0);
	      return sum==temp;
	}
}