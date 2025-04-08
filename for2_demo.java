//write a program to sum and average of even numbers from 80 to 100//
class for2_demo
{
	public static void main(String args[])
	{
		int i=80;
		int sum=0;
		double avg;
		for(i=80; i<=100; i+=2)
		{
			sum=sum+i;
			System.out.println(i);
		}
		avg=sum/i;
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
	}
}