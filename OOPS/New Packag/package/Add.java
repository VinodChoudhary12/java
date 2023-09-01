import mypack1.Addition;
class Test 
{
	public static void main(String args[])
	{
		Addition ob  = new Addition();
		ob.setData(5,8);
		System.out.println("Addition  = "+ob.getAdd());
	}
}