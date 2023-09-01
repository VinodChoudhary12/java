package mypack2;
import mypack1.SinglePerson;
public class SingleTeacher extends SinglePerson
{
	String subject;
	String college;
	public void setData(String name, String age, int weight, String height, String subject, String college)
	{
		super.setData(name, age, weight, height);
		this.subject  = subject;
		this.college = college;
		
	}
	public void getTeacher()
	{
	  System.out.println("Institute :"+college+"\nSubject : "+subject);
	}
	
}
