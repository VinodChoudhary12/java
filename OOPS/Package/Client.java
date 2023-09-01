import pack1.Area;
import pack2.Volume;
import pack3.Density;
class Client
{
	public static void main(String args[])
	{
		Area ar = new Area();
		Volume vo = new Volume();
		Density de = new Density();
		System.out.println(ar.area(4,3));
		System.out.println(vo.volume(2,3,4));
		System.out.println(de.density(1,2,3,2));
	
	
	}




}