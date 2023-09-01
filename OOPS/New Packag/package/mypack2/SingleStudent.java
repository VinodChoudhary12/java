package mypack2;
import mypack1.SinglePerson;
public class SingleStudent extends SinglePerson
{
	int marks;
	double per;
	public void setData(String name, String age, int weight, String height, int marks, double per)
	{
		this.setData(name, age, weight, height);
		this.marks  = marks;
		this.per = per;
		
	}
	public void getStudent()
	{
	  System.out.println("Marks : "+marks+" out of 600"+"\nPercentage : "+per);
	}
	
}