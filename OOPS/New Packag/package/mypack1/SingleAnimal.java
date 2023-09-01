package mypack1;
public class SingleAnimal
{
	String colour,age;
	int weight;
	int height;
	public void setData(String colour,String age, int weight, int height)
	{
		this.age = age;
		this.colour  = colour;
		this.weight = weight;
		this.height = height;
	}
	public void getAnimal()
	{
		System.out.println("colour :"+colour+"\nAge :"+age+"\nWeight :"+weight+"\nHeight :"+height);
	}
	
}