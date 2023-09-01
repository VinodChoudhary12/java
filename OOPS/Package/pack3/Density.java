package pack3;
import pack2.Volume;
public class Density extends Volume
{
	public double density(int a,int b,int c,int m)
	{
		return (super.volume(a,b,c)/m);
	}

}