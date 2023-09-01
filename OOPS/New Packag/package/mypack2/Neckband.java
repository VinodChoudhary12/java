package mypack2;
import mypack1.SoundInstrument;
public class Neckband extends SoundInstrument
{
	String brand,battery;
	public void setData(int driver, int speaker, String brand, String battery)
	{
		super.setData(driver, speaker);
		this.battery  = battery;
		this.brand = brand;
		
	}
	public void getNeckband()
	{
	  System.out.println("Brand : "+brand+"\nBattery capacity : "+battery+"mAh");
	}
	
}
