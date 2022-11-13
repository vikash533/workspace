//define a method to print no of days in the month no.
import java.util.Scanner;
class Example15
{
public static String monthNumber(int m)
{
String days;
if (m==1 || m==3 ||m==5||m==7||m==8||m==10||m==12)
return days="31 days";
else if (m==2 )
return days="28 OR 29 days";
else if (m==4||m==6||m==9||m==11)
return days="30 days";
else
return days="invalid";
}
public static void main (String [] args)
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the month number");
int month=sc.nextInt();
String days=monthNumber(month);
System.out.println ("The no of days in the given month no is .."+days);
}
}