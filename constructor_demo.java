//write a program to demonstrate constructor in java//
class constructor
{
	int a,b;
	constructor()
	{
	}
	constructor(int x,int y)
	{
		a=x;
		b=y;
	}
	void display()
	{
		int sum=0;
		sum=a+b;
		System.out.println("sum="+sum);
	}
}
class constructor_demo
{
	public static void main(String args[])
	{
		constructor const1=new constructor(5,6);
		const1.display();
		constructor const2=new constructor(10,20);
		const2.display();
	}
}