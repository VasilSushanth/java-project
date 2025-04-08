class exception_demo
{
	public static void main(String args[])
	{
		int a=10,b=5,c=5;
		try
		{
			int x=a/(b-c);
			System.out.println(x);
		}
		catch(ArthmaticException e)
		{
			System.out.println("division by zero error");
		}
	}
}