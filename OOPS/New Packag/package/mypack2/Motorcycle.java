package mypack2;
import mypack1.TwoWheeler;
public class Motorcycle extends TwoWheeler
{
	int average;
	int gears;
	public void setData(String brand,int speed, int average, int gears)
	{
		super.setData(brand,speed);
		this.average = average;
		this.gears = gears;
		
	}
	public void getMotorcycle()
	{
	  System.out.println("Average : "+average+"\nNumber of gears : "+gears);
	}
	
}
