//wajp to print biggest amoung 4 no using ternary operator
import java.util.Scanner;
class Example10
{
public static void main (String [] args)
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the first no. a :");
double a=sc.nextDouble();
System.out.println ("Enter the 2nd no. b :");
double b=sc.nextDouble();
System.out.println ("Enter the 3rd no. c :");
double c=sc.nextDouble();
System.out.println ("Enter the 3rd no. c :");
double d=sc.nextDouble();
double big=(a>b && a>c && a>d)?a:(b>c && b>d)?b:(c>d)?c:d;
System.out.println (big+"...is the biggest amoung 4");
}
}