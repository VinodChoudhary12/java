package mypack2;
import mypack1.Device;
public class Camera extends Device 
{
    	int pixelSize;
	String resolution;

    	public Camera(String resolution, int pixelSize, String brand) 
	{
        	super(brand);
        	this.pixelSize = pixelSize;
		this.resolution = resolution;
    	}

    	public void displayInfo() 
	{
        	super.displayInfo();
        	System.out.println("Pixel Size: " + this.pixelSize);
		System.out.println("Camera resolution: " + this.resolution);
    	}
}
