/* define a method to print student result like
   distinction >=85
   first class >=60
   pass >=35
   fail <35 in any subject */
import java.util.Scanner;
class Example16
{
public static String result(int p,int c,int m)
{
if (p>=35 && c>=35 && m>=35)
{
if (p>=85 && c>=85 && m>=85 && p<=100 && c<=100 && m<=100)
return "Distinction";
else if (p>=60 && c>=60 && m>=60 && p<=100 && c<=100 && m<=100 )
return "First Division";
else 
return "Pass";
}
else
return "Fail";
}
public static void main (String [] args)
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the physics marks ");
int physics=sc.nextInt();
System.out.println ("Enter the chemistry marks ");
int chemistry=sc.nextInt();
System.out.println ("Enter the math marks ");
int math=sc.nextInt();
String result=result(physics,chemistry ,math);
System.out.println ("Result :"+result);

}
}