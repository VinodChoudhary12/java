package mypack1;
public class Building 
{
    	String type;

    	public Building(String type) 
	{
        	this.type = type;
    	}

    	public void displayInfo() 
	{
        	System.out.println("Building Type: " + type);
    	}
}