package mypack2;
import mypack1.SinglePerson;
public class SingleDoctor extends SinglePerson
{
	int noOfPatient;
	public void setData(String name, String age, int weight, String height,int noOfPatient)
	{
		this.setData(name, age, weight, height);
		this.noOfPatient = noOfPatient;
	}
	public void getDoctor()
	{
	  System.out.println("Total patient of Doctor :"+noOfPatient);
	}
	
}