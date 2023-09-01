import mypack2.SingleDog;
class Test extends SingleDog
{
	public static void main(String args [])
	{
		SingleDog ob = new SingleDog();
		ob.setData("black", "10", 35, 60, "Husky");
		ob.getDog();
		ob.getAnimal();
	}
}