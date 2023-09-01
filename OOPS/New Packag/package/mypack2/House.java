package mypack2;
import mypack1.Building;
public class House extends Building 
{
    	int numberOfRooms;

    	public House(String type, int numberOfRooms) 
	{
        	super(type);
        	this.numberOfRooms = numberOfRooms;
    	}

    	public void displayInfo() 
	{
        	super.displayInfo();
        	System.out.println("Number of Rooms: " + numberOfRooms);
    	}
}