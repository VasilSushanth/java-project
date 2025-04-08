import java.io.DataInputStream;
class idk
{
	public static void main(String args[])
	{
		int a,b,c;
		DataInputStream x=new DataInputStream(System.in);
		System.out.println("enter the number");
		try
		{
			a=Integer.parseInt(x.readLine());
			b=Integer.parseInt(x.readLine());
			c=(a+b);
			System.out.println(c);
		}
		catch(Exception e){}
	}
}