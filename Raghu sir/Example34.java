//wajp to print decirium no within 1000
class Example34 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=1000 ;i++ )
		{
			boolean rs=isDecirium(i);
			if (rs==true)
			{
				System.out.println (i);
			}
		}
		
	}
	public static boolean isDecirium(int n)
	{
	     int sum=0,temp=n;
		 int dc=getCount(n);
		 do
		 {
			 int d=n%10;
			 sum=sum+pow(d,dc);
			 dc--;
			 n=n/10;
		 }
		 while (n!=0);
		 return sum==temp;
	}
	public static int getCount(int n)
	{
	   int count=0;
	   while (n>0)
	   {
		   count++;
		   n=n/10;
	   }
	   return count;
	}
	public static int pow (int d,int dc)
	{
	  int pw=1;
	  while (dc>0)
	  {
		  pw=pw*d;
		  dc--;
	  }
	  return pw;
	}
}
