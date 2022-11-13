//wajp to check integer is digit or no
import java.util.Scanner;
class Digit
{
public static void main (String arg [])
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the no");
int n=sc.nextInt ();
if (n/10==0)
System.out.println ("digit");
else
System.out.println ("number");
}
}