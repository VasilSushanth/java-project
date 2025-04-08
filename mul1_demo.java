import java.io.DataInputStream;
class mul1_demo
{
	public static void main(String args[])
	{
		int a;
		int b;
		int mul;
		DataInputStream x=new DataInputStream(System.in);
		System.out.println("enter the 2 numbers:");
		try
		{
			a=Integer.parseInt(x.readLine());
			b=Integer.parseInt(x.readLine());
			mul=a*b;
			System.out.println("multiplicetion of two numbers is:"+mul);
		}
		catch(Exception e){}
	}
}