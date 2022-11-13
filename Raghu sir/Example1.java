//wajp to read 4 subject marks if score >=35 status as pass
import java.util.Scanner;
class Example1
{
public static void main (String args [])
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the math subject marks");
int a=sc.nextInt();
System.out.println ("Enter the physics subject marks");
int b=sc.nextInt();
System.out.println ("Enter the chemistry subject marks");
int c=sc.nextInt();
System.out.println ("Enter the biology subject marks");
int d=sc.nextInt();

if (a>=35 && b>=35 && c>=35 && d>=35)
System.out.println ("Result : pass");
else
System.out.println ("Result : fail");
}
}