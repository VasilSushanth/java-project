//write a program to demonstrate continue statement//
class continue_demo
{
	public static void main(String args[])
	{
		int i;
		for(i=1; i<=10; i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);	
		}
	}
}