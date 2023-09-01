package mypack1;
public class Device
{
    	String brand;

    	public Device(String brand) 
	{
        	this.brand = brand;
    	}

    	public void displayInfo() 
	{
        	System.out.println("Device : " + brand);
    	}
}