package mypack2;
import mypack1.Building;
public class Office extends Building 
{
    	String companyName;

    	public Office(String type, String companyName) 
	{
        	super(type);
        	this.companyName = companyName;
    	}

    	public void displayInfo() 
	{
        	super.displayInfo();
        	System.out.println("Company Name: " + companyName);
    	}
}