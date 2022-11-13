//wajp to print user enter amount in the form of word
import java.util.Scanner;
class NumberToWord
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int n=sc.nextInt();
		nw(n/10000000,"crore");
		nw(n/100000%100,"lakh");
		nw(n/1000%100,"thousand");
		nw(n/100%10,"hundred");
		nw(n%100,"");
	}
	public static void nw(int n,String st)
	{
	   String fd []={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	   String sd []={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	   if(n<20)
		   System.out.print(fd[n]+" ");
	   else
		   System.out.print(sd[n/10]+" "+fd[n%10]+" ");
	   if(n!=0)
		   System.out.print(st+" ");
	}
}
