//wajp to read the date from the user and print date is valid or not
import java.util.Scanner;
class Example11
{
public static void main (String [] args)
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the __day");
int day=sc.nextInt();
System.out.println ("Enter the __month");
int month=sc.nextInt();
System.out.println ("Enter the ____year");
int year=sc.nextInt();

if ((year%4==0 && year%100!=0)||(year%400==0))
  {
  if (month==2 && day>=1 && day<=29)
   System.out.println ("It is a valid date");
  else if (month==1||month==3||month==5||month==7||month==8||month==10||month==12 && (day>=1 && day<=31) )
   System.out.println ("It is a valid date");
  else if (month==4||month==6||month==9||month==11 && (day>=1 && day<=30))
    System.out.println ("It is a valid date");
  else 
     System.out.println ("It is a invalid date");
  }
else 
{
  if (month==2 && day>=1 && day<=28)
   System.out.println ("It is a valid date");
  else if (month==1||month==3||month==5||month==7||month==8||month==10||month==12 && (day>=1 && day<=31))
   System.out.println ("It is a valid date");
  else if (month==4||month==6||month==9||month==11 && (day>=1 && day<=30))
    System.out.println ("It is a valid date");
  else 
     System.out.println ("It is a invalid date");  
       
  }
}
} 