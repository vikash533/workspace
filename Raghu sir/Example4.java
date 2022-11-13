// to print year is a leap year or not
import java.util.Scanner;
class Example4
{
public static void main (String args [])
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the year ");
int n=sc.nextInt();

if (n%4==0 && n%100!=0 || n%400==0)
System.out.println ("It is a leap year");
else 
System.out.println ("It is not the leap year");


}
}