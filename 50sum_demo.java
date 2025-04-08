//write a program to sum and average of even numbers from 50 to 100//
class 50sum_demo
{
	public static void main(String args[])
	{
		int i;
		int sum;
		sum=0;
		for(i=50; i<=100; i+=2)
		{
			sum=sum+i;
			System.out.println(i);
		}
		avg=sum/i;
		System.out.println("avg="+avg);
		System.out.println("sum="+sum);
	}
}