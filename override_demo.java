//write a program to demonstrate method override//
class superclass
{
	int x;
	superclass(int x)
	{
		this.x=x;
	}
	void display()
	{
		System.out.println("x="+x);
	}
}
class subclass extends superclass
{
	int y;
	subclass(int x,int y)
	{
		super(x);
		this.y=y;
	}
	void display()
	{
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
class override_demo
{
	public static void main(String args[])
	{
		subclass sub=new subclass(10,20);
		sub.display();
	}
}