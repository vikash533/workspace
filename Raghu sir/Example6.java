//wajp to print sanju if no. is divisible by 3, print geeta if no is divisible by 5 and print sanju weds geeta if no is divisible by both other wise breakup
import java.util.Scanner;
class Example6
{
public static void main (String [] args)
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the number");
int n=sc.nextInt ();
if (n%3==0 && n%5==0)
System.out.println ("Sanju weds geeta");
else if (n%5==0 )
System.out.println ("Geeta");
else if (n%3==0 )
System.out.println ("Sanju");
else
System.out.println ("Break up");
}
}