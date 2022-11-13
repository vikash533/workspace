class MainArray1
{
	public static void main(String[] args) 
	{
		ArrayOperation ao=new ArrayOperation();
		int ar []=ao.readArray();
		System.out.println ("User entered the array");
		ao.displayArray(ar);
		System.out.println ("Biggest no is..."+ao.getBiggest(ar));
		System.out.println ("Smallest no. is... "+ao.getSmallest(ar));
	}
}
