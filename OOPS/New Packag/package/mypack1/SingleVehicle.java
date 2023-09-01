package mypack1;
public class SingleVehicle
{
	String colour;
	int average;
	int speed;
	public void setData(String colour,int average, int speed)
	{
		this.colour  = colour;
		this.average = average;
		this.speed = speed;
	}
	public void getVehicle()
	{
		System.out.println("colour :"+colour+"\naverage :"+average+"\nspeed :"+speed);
	}
	
}
