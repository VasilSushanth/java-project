//write a program to generate factorial of a given number//
class factorial
{
	public static void main(String args[])
	{
		int fact=1;
		int i;
		for(i=1; i<=5; i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
	}
}