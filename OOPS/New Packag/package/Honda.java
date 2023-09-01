import mypack2.Honda;
class Test
{
	public static void main(String args [])
	{
		Honda ob = new Honda();
		ob.getStart();
		System.out.println("no. of gears in honda : "+ob.getGears());
		ob.getRun();
		ob.getStop();
	}
}