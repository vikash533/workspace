//define a method to return middle amoung three value
import java.util.Scanner;
class Example13
{
public static void main (String [] args)
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the three number");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int rs=middle(a,b,c);
System.out.println ("The middle value is ...."+rs);
}
public static int middle(int a, int b, int c)
{
if (a>b && a<c || a>c && a<b)
return a;
else if (b>a && b<c || b>c && b<a)
return b;
else
return c;
}
}