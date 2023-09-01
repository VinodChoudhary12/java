package mypack1;
import mypack1.Square;
public class Addition extends Square
{
	private int b;
	public void setData(int a, int b)
	{
		this.setData(a);
		this.b = b;
	}
	public int getB()
	{
		return b;
	}
	public int getAdd()
	{
		return this.getA()+this.getB();
	}

}