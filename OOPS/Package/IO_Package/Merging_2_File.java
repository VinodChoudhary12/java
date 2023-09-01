import java.io.*;
import java.util.Scanner;
class Test
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name For Create Your File:");
		String name = sc.nextLine();
		System.out.println("Enter The Mod Of Your File :");
		String mod=sc.nextLine();
		File fobj = new File(name+"."+mod);
		FileInputStream fos1 = new FileInputStream("Pattern2.txt");
		FileInputStream fos2 = new FileInputStream("Power.text");
		FileOutputStream ob = new FileOutputStream(fobj,true);
		
		int x;
		while((x=fos1.read())!=-1)
		{
			ob.write(x);
		}
		ob.write('\n');
		
		int y;
		while((y=fos2.read())!=-1)
		{
			ob.write(y);
		}
		
		ob.close();
	}
}