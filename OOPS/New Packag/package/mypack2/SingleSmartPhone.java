package mypack2;
import mypack1.SingleMobile;
public class SingleSmartPhone extends SingleMobile
{
	String camera;
	public void setData(String brand,String battery, String sim, String speaker,String camera)
	{
		super.setData(brand,battery,sim,speaker);
		this.camera = camera;
		
	}
	public void getSmartPhone()
	{
	  System.out.println("Number of camera : "+camera);
	}
	
}
