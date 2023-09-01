package mypack2;
import mypack1.Car;
public class Honda extends Car
{
	public void getStart()
	{
		this.setAvgSpeed(40);
		System.out.println("Car Starts with speed : "+this.getAvgSpeed());
	}
	public void getRun()
	{
		this.setMaxSpeed(100);
		System.out.println("Top speed : "+this.getMaxSpeed());
	}
	public void getStop()
	{
		System.out.println("Car is stopped");
	}
}