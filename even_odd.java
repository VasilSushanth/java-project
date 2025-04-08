//write a program to read an integer and find the even or odd//
import java.io.DataInputStream;
class even_odd
{
	public static void main(String args[])
	{
		int a,b;
		DataInputStream x=new DataInputStream(System.in);
		System.out.println("enter the value of a and b");
		try
		{
			a=Integer.parseInt(x.readLine());
			b=Integer.parseInt(x.readLine());
			if(a%2==0)
			{
				System.out.println("even number");
			}
			else
			{
				System.out.println("odd number");
			}
			if(b%2==0)
			{
				System.out.println("even number");
			}
			else
			{
				System.out.println("odd number");
			}
		}
		catch(Exception e){}
	}
}