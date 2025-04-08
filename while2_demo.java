//write a program to calculate sum and average of numbers from 10 to 20 using while statement//
class while2_demo
{
	public static void main(String args[])
	{
		int sum=0;
		int avg;
		int i=11;
		while(i<=20)
		{
			System.out.println(i);
			sum=sum+i;
			i+=2;
			
		}
		avg=sum/i;
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
	}
}