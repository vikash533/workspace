//wajp to even or odd
import java.util.Scanner;
class Even
{
public static void main (String arg [])
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the no");
int n=sc.nextInt ();
String st[]= {"Even","odd"};
System.out.println (n+ "is"+st[n%2]);

}

}