// wajp to find middle no.
import java.util.Scanner;
class Example8
{
public static void main (String [] args)
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the first no. a :");
int a=sc.nextInt();
System.out.println ("Enter the 2nd no. b :");
int b=sc.nextInt();
System.out.println ("Enter the 3rd no. c :");
int c=sc.nextInt();
int small=(a<b&&a<c)?a:(b<c)?b:c;
int big=(a>b&&a>c)?a:(b>c)?b:c;
System.out.println ("smallest is..."+small);
System.out.println ("biggest is ...."+big);
if (big>a && a>small)
System.out.println (a+" is the middle no.");
else if (big>b && b>small)
System.out.println (b+" is the middle no.");
else
System.out.println (c+" is the middle no.");
}
}