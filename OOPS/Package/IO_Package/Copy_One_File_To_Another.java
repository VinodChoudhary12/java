import java.io.*;
import java.util.Scanner;
class Test
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name For Create Your File:");
		String name = sc.nextLine();
		File fobj = new File(name+".txt");
		FileInputStream fos = new FileInputStream("Pattern2.txt");
		FileOutputStream ob = new FileOutputStream(fobj);
		int x;
		while((x=fos.read())!=-1)
		{
			ob.write(x);
		}
		ob.close();
	}
	
}