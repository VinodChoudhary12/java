import mypack2.SingleDoctor;
class Test
{
	public static void main(String args [])
	{
		SingleDoctor ob = new SingleDoctor();
		ob.setData("Vinod", "22", 50,"175 cms",5);
		ob.getPerson();
		ob.getDoctor();
	}
}