/* define a method to print student result like
   distinction >=85%
   first class >=60%
   pass >=35%
   fail <35 in any subject */
import java.util.Scanner;
class Example17
{
public static String result(double p,double c,double m,double b)
{

double perc=(p+c+m+b)/4;
if (perc>=85 && perc<=100)
return "Distinction";
else if (perc>=60 && perc<85)
return "First Division";
else if (perc>=50 && perc<60)
return "2nd Division";
else if (perc>=35)
return "pass";
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
System.out.println ("Enter the biology marks ");
int biology=sc.nextInt();
String result=result(physics,chemistry ,math,biology);
System.out.println ("Result :"+result);

}
}