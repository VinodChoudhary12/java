package mypack1;
public class SingleMobile
{
	String brand,battery,sim,speaker;
	public void setData(String brand,String battery, String sim, String speaker)
	{
		this.brand = brand;
		this.battery = battery;
		this.sim = sim;
		this.speaker = speaker; 
	}
	public void getMobile()
	{
		System.out.println("Brand :"+brand+"\nBattery capacity : "+battery+"mAh"+"\nSIM : "+sim+"\nNumber of speaker :"+speaker);
	}
	
}
