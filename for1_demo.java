//write a program to file the sum and average of odd numbers from 1 to 20//
class for1_demo
{
	public static void main(String args[])
	{
		int i;
		int sum=0;
		double avg;
		for(i=1; i<=20; i+=2)
		{
			sum=sum+i;
			System.out.println(i);
		}
		avg=sum/i;
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
	}
}