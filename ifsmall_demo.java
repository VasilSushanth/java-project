//write a program to find the smallest of 4 numbers using readline method//
import java.io.DataInputStream;
class ifsmall_demo
{
	public static void main(String args[])
	{
		int a,b,c,d;
		DataInputStream x=new DataInputStream(System.in);
		System.out.println("enter the values of a,b,c,d");
		try
		{
			a=Integer.parseInt(x.readLine());
			b=Integer.parseInt(x.readLine());
			c=Integer.parseInt(x.readLine());
			d=Integer.parseInt(x.readLine());
			if(a<b && a<c && a<d)
			{
				System.out.println("a is smallest");
			}
			else if(b<c && b<d)
			{
				System.out.println("b is smallest");
			}
			else if(c<d)
			{
				System.out.println("c is smallest");
			}
			else
			{
				System.out.println("d is smallest");
			}
		}
		catch (Exception e){}
	}
}
