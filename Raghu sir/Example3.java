// wajp to print integer is a two digit no or not
import java.util.Scanner;
class Example3
{
public static void main (String args [])
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the number ");
int n=sc.nextInt();


int e=n/10;
if (e>-10 && e<0 || e>0 && e<10)
System.out.println ("it is a two digit number");

else if (e==0)
System.out.println ("it is a single  digit number");

else 
System.out.println ("invalid number");


}
}