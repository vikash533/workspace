// define a method to return smallest among 3 double value
import java.util.Scanner;
class Example12
{
public static void main (String [] args)
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the three number");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double rs=smallest(a,b,c);
System.out.println ("Smallest amoung three is ..."+rs);
}
public static double smallest(double a,double b, double c)
{
if (a<b && a<c)
return a;
else if (b<a && b<c)
return b;
else 
return c;
}
}