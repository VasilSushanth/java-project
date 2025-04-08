//write a program to perform method overloading//
class overloading
{
	int sum(int x,int y)
	{
		return(x+y);
	}
	int sum(int x,int y,int z)
	{
		return(x+y+z);
	}
	double sum(double x,double y)
	{
		return(x+y);
	}
}
class overloading_demo
{
	public static void main(String args[])
	{
		overloading over=new overloading();
		System.out.println("sum="+over.sum(10,20));
		System.out.println("sum="+over.sum(10,20,30));
		System.out.println("sum="+over.sum(2.5,3.5));
	}
}