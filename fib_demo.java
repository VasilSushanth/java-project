//write a program to generate fibonacii series from 1 to 20//
class fib_demo
{
	public static void main(String args[])
	{
		int a=0,b=1,c;
		do
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		while(c<=20);
	}
}