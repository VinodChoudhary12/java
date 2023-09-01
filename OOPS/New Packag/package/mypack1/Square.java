package mypack1;
public class Square
{
	int a;
	public void setData(int a)
	{
		this.a = a;
	}
	public int getA()
	{
		return a;
	}
	public int getSq()
	{
		return this.getA()*this.getA();
	}
}
