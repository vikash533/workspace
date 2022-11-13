// Special two digit no
import java.util.Scanner;
class Special
{
public static void main (String [] z)
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the number ");
int n=sc.nextInt ();
int a=n/10;
int b=n%10;
int c=a+b+a*b;
if (n==c)
System.out.println ("Special number");
else 
System.out.println ("not a special number");
} 
}