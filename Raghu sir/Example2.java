//wajp to read month no and print how many days in a month

import java.util.Scanner;
class Example2
{
public static void main (String args [])
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter the number ");
int n=sc.nextInt();
switch (n)
{
case 1:System.out.println ("its january so 31 days");
          break;
case 2:System.out.println ("its feburary so 28 days");
          break;
case 3:System.out.println ("its march so 31 days");
          break;
case 4:System.out.println ("its april so 30 days");
          break;
case 5:System.out.println ("its may so 31 days");
          break;
case 6:System.out.println ("its june so 30 days");
          break;
case 7:System.out.println ("its july so 31 days");
          break;
case 8:System.out.println ("its august so 31 days");
          break;
case 9:System.out.println ("its september so 30 days");
          break;
case 10:System.out.println ("its october so 31 days");
          break;
case 11:System.out.println ("its november so 30 days");
          break;
case 12: System.out.println ("its december so 31 days");
          break;
default : System.out.println ("invalid number");
          
}
}
}