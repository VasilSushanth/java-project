//write a prgoram to input array elements in the readline elements//
import java.io.DataInputStream;
class array_demo3
{
	public static void main(String args[])
	{
		int x[]=new int[5];
		int i;
		System.out.println("enter the 5 elements");
		DataInputStream n=new DataInputStream(System.in);
		try
		{
			for(i=0; i<5; i++)
			{
				x[i]=Integer.parseInt(n.readLine());
			}
		}
		catch(Exception e){}
		for(i=0; i<5; i++)
		{
			System.out.println(x[i]);
		}
	}
}