package mypack2;
import mypack1.SingleVehicle;
public class SingleCar extends SingleVehicle
{
	String brand;
	public void setData(String colour,int average, int speed, String brand)
	{
		super.setData(colour, average, speed);
		this.brand  = brand;
		
	}
	public void getCar()
	{
	  System.out.println("Car of Brand : "+brand);
	}
	
}