 // biggest no among 3 number
import java.util.Scanner;
class Biggest
{
public static void main (String arg [])
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the number is a: ");
int a=sc.nextInt ();
System.out.println ("Enter the number is b : ");
int b=sc.nextInt ();
System.out.println ("Enter the number is c :");
int c=sc.nextInt ();

int big =(a>b && a>c)?a:(b>c)?b:c;
System.out.println ("Biggest no is "+big);
}
}
