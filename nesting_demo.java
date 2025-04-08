//program to demonstrate nesting of methods//
class nesting
{
	int x,y;
	nesting(int a,int b)
	{
		x=a;
		y=b;
	}
	int largest()
	{
		if(x>y)
		{
			return(x);
		}
		else
		{
			return(y);
		}
	}
	void display()
	{
		largest();
		System.out.println("the largest value is:"+largest());
	}
}
class nesting_demo
{
	public static void main(String args[])
	{
		nesting nest=new nesting(10,20);
		nest.display();
	}
}
		
		
		