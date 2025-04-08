//write a program to read in array elements using commandline args//
class array_demo2
{
	public static void main(String args[])
	{
		int len=args.length;
		int x[]=new int[len];
		int i;
		for(i=0; i<len; i++)
		{
			x[i]=Integer.parseInt(args[i]);
		}
		for(i=0; i<len; i++)
		{
			System.out.println(x[i]);
		}
	}
}