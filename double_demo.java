//write a program to demonstrate 2 dimensional arrays//
class double_demo
{
	public static void main(String args[])
	{
		int x[][]={{10,20,30},{40,50,60}};
		int i,j;
		for(i=0; i<2; i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println(x[i][j]);
			}
		}
	}
}