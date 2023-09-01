package pack2;
import pack1.Area;
public class Volume extends Area
{
	public double volume(int a,int b,int c)
	{
		return (super.area(a,b))*c;
	}

}