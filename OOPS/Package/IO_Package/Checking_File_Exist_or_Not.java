import java.util.Scanner;
import java.io.*;
class Test
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your File Name:");
		String name = sc.nextLine();
		File ob = new File(name+".txt");
		
		if(ob.exists())
		{
			if(ob.exists()&&ob.lenght()==0)
			{
				System.out.println(name+"Is Empty File:");
			}
			else
			{
				FileInputStream fin = new FileInputStream("Power.text");
				FileOutputStream fos = new FileOutputStream(ob);
				int x;
				while((x=fin.read())!=-1)
				{
					fos.write(x);
				}
				fos.close();
			}
		}
		else
		{
			System.out.println(name +".txt File Is Not Exist");
		}
	}
}