//wajp to check user enter no is month or not
import java.util.Scanner;
class Month
{
public static void main (String arg [])
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the no");
int n=sc.nextInt ();
if (n<=12 &&  n>0)
System.out.println ("Enter no is a month");
else 
System.out.println ("not a month");
}}