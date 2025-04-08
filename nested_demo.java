//write a program to demonstrate nested if statement//
import java.io.DataInputStream;
class nested_demo
{
	public static void main(String args[])
	{
		int a,b,c;
		DataInputStream x=new DataInputStream(System.in);
		System.out.println("enter the values of a,b,c");
		try
		{
			a=Integer.parseInt(x.readLine());
			b=Integer.parseInt(x.readLine());
			c=Integer.parseInt(x.readLine());
			if(a>b)
			{
				if(a>c)
				{
					System.out.println("a is greatest");
				}
				else
				{
					System.out.println("c is greatest");
				}
			}
			else if(b>c)
			{
				System.out.println("b is greatest");
			}
			else
			{
				System.out.println("c is greatest");
			}
		}
		catch(Exception e){}
	}
} 