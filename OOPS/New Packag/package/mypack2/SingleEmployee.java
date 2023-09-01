package mypack2;
import mypack1.SinglePerson;
public class SingleEmployee extends SinglePerson
{
	int salary;
	public void setData(String name, String age, int weight, String height, int salary)
	{
		this.setData(name, age, weight, height);
		this.salary = salary;
		
	}
	public void getEmployee()
	{
	  System.out.println("Salary :"+salary);
	}
	
}