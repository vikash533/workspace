//wajp to read the date from the user and print date is valid or not
import java.util.Scanner;
class Example7
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
    switch (month)
    {
    case 1:if (day>=1 && day<=31)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
     case 2:if (day>=1 && day<=29)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
      case 3:if (day>=1 && day<=31)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
       case 4:if (day>=1 && day<=30)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
       case 5:if (day>=1 && day<=31)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
        case 6:if (day>=1 && day<=30)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
        case 7:if (day>=1 && day<=31)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
        case 8:if (day>=1 && day<=31)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
        case 9:if (day>=1 && day<=30)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
         case 10:if (day>=1 && day<=31)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
         case 11:if (day>=1 && day<=30)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
         case 12:if (day>=1 && day<=31)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
         default:System.out.println ("Invalid date");
    }
       
  }
else 
{
    switch (month)
    {
    case 1:if (day>=1 && day<=31)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
     case 2:if (day>=1 && day<=28)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
      case 3:if (day>=1 && day<=31)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
       case 4:if (day>=1 && day<=30)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
       case 5:if (day>=1 && day<=31)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
        case 6:if (day>=1 && day<=30)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
        case 7:if (day>=1 && day<=31)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
        case 8:if (day>=1 && day<=31)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
        case 9:if (day>=1 && day<=30)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
         case 10:if (day>=1 && day<=31)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
         case 11:if (day>=1 && day<=30)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
         case 12:if (day>=1 && day<=31)
           System.out.println ("It is a valid date");
           else
           System.out.println ("It is a invalid date");
           break; 
         default:System.out.println ("Invalid date");
    }
       
  }
}
} 