package mypack2;
import mypack1.SingleAnimal;
public class SingleDog extends SingleAnimal
{
	String breed;
	public void setData(String colour,String age, int weight, int height, String breed)
	{
		super.setData(colour, age, weight, height);
		this.breed  = breed;
		
	}
	public void getDog()
	{
	  System.out.println("Dog of breed :"+breed);
	}
	
}
