//write a program to demonstrate interfaces//
interface area
{
	final static double pi=3.148;
	double compute(double x,double y);
}
class rectangle implements area
{
	public double compute(double x,double y)
	{
		return(x*y);
	}
}
class circle implements area
{
	public double compute(double x,double y)
	{
		return(x*x*pi);
	}
}
class interface_demo
{
	public static void main(String args[])
	{
		rectangle rect=new rectangle();
		circle cir=new circle();
		area area1;
		area1=rect;
		System.out.println("area of rect="+area1.compute(2.5,3.5));
		area1=cir;
		System.out.println("area of circle="+area1.compute(1.5,2.5));
	}
}