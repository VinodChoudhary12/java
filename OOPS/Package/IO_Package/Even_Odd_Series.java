import java.io.*;
import java.util.Scanner;
class Test
{
	public static void main(String[]args) throws Exception
	{
		File ob = new File("EvenOddSeries.txt");
		FileOutputStream obj = new FileOutputStream(ob);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		 
		//System.out.println("Even number : ");
		obj.write("Even Number\n");
		
		for(int i = 1;i<=n;i++)
		{
			if(i%2==0)
			{
						//System.out.print(i+" ");
				obj.write(48+i);
						
			}
		}
		//System.out.println("\nodd number : ");
		for(int i = 1;i<=n;i++)
		{
			if(i%2!=0)
			{
						//System.out.print(i+" ");
				obj.write(i+48);
			}
		}
	}
}