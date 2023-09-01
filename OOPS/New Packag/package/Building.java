import mypack1.House;
import mypack2.Office;
class Test 
{
    	public static void main(String[] args) 
	{
        	House ob = new House("Residential", 3);
        	Office ob1 = new Office("Commercial", "Infobeans");
        
	        System.out.println("Building Information:");
        	ob.displayInfo();
        	System.out.println();
        	ob1.displayInfo();
    	}
}