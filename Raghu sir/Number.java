// wajp to check user entered no is negative or positive
import java.util.Scanner;
class Number
{
public static void main (String arg [])
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the no");
int n=sc.nextInt ();
if (n>0)
System.out.println ("positive no");
else if (n==0)
System.out.println ("neither positive nor negative");
else 
System.out.println ("negative no");
}
}