//write a program to calculate arthmatic operation(sum,sub,multi,div)using seperate class and object//
class sum
{
	int a,b;
	void input(int x,int y)
	{
		a=x;
		b=y;
	}
	int sum1()
	{
		return(a+b);
	}
}
class sub
{
	int a,b;
	void input(int x,int y)
	{
		a=x;
		b=y;
	}
	int sub1()
	{
		return(a-b);
	}
}
class mul
{
	int a,b;
	void input(int x,int y)
	{
		a=x;
		b=y;
	}
	int mul1()
	{
		return(a*b);
	}
}
class division
{
	double a,b;
	void input(double x,double y)
	{
		a=x;
		b=y;
	}
	double div1()
	{
		return(a/b);
	}
}
class arthmatic2_demo
{
	public static void main(String args[])
	{
		sum s=new sum();
		sub s1=new sub();
		mul m=new mul();
		division d=new division();
		s.input(10,20);
		System.out.println("sum="+s.sum1());
		s1.input(45,30);
		System.out.println("sub="+s1.sub1());
		m.input(55,65);
		System.out.println("mul="+m.mul1());
		d.input(50,3);
		System.out.println("div="+d.div1());
	}
}