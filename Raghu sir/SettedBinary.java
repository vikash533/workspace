//wajp to  return how many bitsw are setted in java programs
import java.util.Scanner;
class SettedBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the decimal no.");
		int n=sc.nextInt();
		int rs=getSetted(n);
		System.out.println("the setted decimal no is..."+rs);
	}
	public static int getSetted(int n)
	{
	    int count=0;
         do
         {
			 int d=n%2;
			 if (d==1)
			 {
				 count++;
			 }
			 n=n/2;
         }
         while (n!=0);
		 return count;
	}
}
