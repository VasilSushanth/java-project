//write a program to create a double dimension array using readline method//
import java.io.DataInputStream;
class double_demo2
{
	public static void main(String args[])
	{
		int a,b,c,d,e,f,i,j;
		DataInputStream s=new DataInputStream(System.in);
		System.out.println("enter the numbers");
		try
		{
			a=Integer.parseInt(s.readLine());
			b=Integer.parseInt(s.readLine());
			c=Integer.parseInt(s.readLine());
			d=Integer.parseInt(s.readLine());
			e=Integer.parseInt(s.readLine());
			f=Integer.parseInt(s.readLine());
			int x[][]={{a,b,c},{d,e,f}};
			for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.println(x[i][j]);
				}
			}
		}
		catch(Exception g){}
	}
}