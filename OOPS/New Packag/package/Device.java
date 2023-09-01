import mypack2.Speaker;
import mypack2.Camera;
class Test 
{
    	public static void main(String[] args) 
	{
        	Speaker ob = new Speaker("boat", "20 mm");
        	Camera ob1 = new Camera("1080*1920", 108, "canon");
        	

        	System.out.println("\t\tDevice information:");
        	ob.displayInfo();
        	System.out.println();
        	ob1.displayInfo();
    }
}