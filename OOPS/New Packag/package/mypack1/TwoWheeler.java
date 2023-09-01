package mypack1;
public class TwoWheeler
{
	String brand;
	int speed;
	public void setData(String brand, int speed)
	{
		this.brand  = brand;
		this.speed = speed; 
	}
	public void getTwoWheeler()
	{
		System.out.println("Brand :"+brand+"\nSpeed :"+speed);
	}
	
}