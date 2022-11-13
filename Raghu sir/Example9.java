// wajp smallest among 3 double value
import java.util.Scanner;
class Example9
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
if (a<b && a<c)
System.out.println (a+ "..is the smallest no.");
else if (b<a && b<c)
System.out.println (b+ "..is the smallest no.");
else
System.out.println (c+ "..is the smallest no.");
}
}