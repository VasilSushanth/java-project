//write a program to demonstrate student result using multi level inheritance//
class student
{
	int rollno;
	String sname;
	String clas;
	int sem;
	void getstudent(int rno,String sname1,String clas1,int sem1)
	{
		rollno=rno;
		sname=sname1;
		clas=clas1;
		sem=sem1;
	}
	void display_student()
	{
		System.out.println("rollno="+rollno);
		System.out.println("sname="+sname);
		System.out.println("class="+clas);
		System.out.println("sem="+sem);
	}
}
class marks extends student
{
	int sub1,sub2,sub3,sub4;
	void getmarks(int s1,int s2,int s3,int s4)
	{
		sub1=s1;
		sub2=s2;
		sub3=s3;
		sub4=s4;
	}
	void display_marks()
	{
		System.out.println("sub1="+sub1);
		System.out.println("sub2="+sub2);
		System.out.println("sub3="+sub3);
		System.out.println("sub4="+sub4);
	}
}
class result extends marks
{
	int total_marks=0;
	int avg;
	void display_result()
	{
		total_marks=sub1+sub2+sub3+sub4;
		avg=total_marks/4;
		if(avg>=80)
		{
			System.out.println("distinction");
		}
		else if(avg>=60)
		{
			System.out.println("first class");
		}
		else if(avg>=50)
		{
			System.out.println("second class");
		}
		else if(avg>=35)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
class multilevel1_demo
{
	public static void main(String args[])
	{
		result s=new result();
		s.getstudent(101,"sushanth","cs",4);
		s.display_student();
		s.getmarks(40,50,64,75);
		s.display_marks();
		s.display_result();
	}
}