// Read the month no from the user and print how many days in a month
import java.util.Scanner;
class Example5
{
public static void main (String [] args)
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the month number");
int n=sc.nextInt();

if (n==1||n==3||n==5||n==7||n==8||n==10||n==12)
System.out.println ("31 days");
else if (n==4||n==6||n==9||n==11)
System.out.println ("30 days");
else if (n==2)
System.out.println ("28 or 29 days");
else
System.out.println ("Invalid input");
}
}