//the following program to demonstrate the read line method//
import java.io.DataInputStream;
//the following program demonstrate the readline method//
import java.io.DataInputStream;
class read_demo
{
	public static void main(String args[])
	{
		int x;
		int y;
		int sum=0;
		System.out.println("enter any 2 numbers");
		DataInputStream n=new DataInputStream(System.in);
		try
		{
			x=Integer.parseInt(n.readLine());
			y=Integer.parseInt(n.readLine());
			sum=x+y;
			System.out.println("sum of x and y="+sum);
		}
		catch (Exception e){}
	}
}