//write a program to demonstrate break statement//
class break_demo
{
	public static void main(String args[])
	{
		int i;
		for(i=1; i<=10; i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
	}
}