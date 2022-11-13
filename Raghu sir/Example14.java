/*wajp to define a method true 
if the year is leap year*/
import java.util.Scanner;
class Example14
{
public static boolean leapYear(int y)
{
if (y%4==0 && y%100!=0 || y%400==0)
return true;
else 
return false;
}
public static void main (String [] args)
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the year");
int year=sc.nextInt();
boolean rs=leapYear(year);
System.out.println ("Is it a leap year :"+rs);
}
}