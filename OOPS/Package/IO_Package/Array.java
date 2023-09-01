import java.io.*;
		import java.util.Scanner;
class Test
{
	public static void main(String args[]) throws Exception
	{
		File fo = new File(Array.txt);
		FileOutputStream obj = new FileOutputStream(fo);
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter any num");
		//int n = sc.nextInt();
		System.out.print("Enter elements in array");
		int n=sc.nextInt();
		int a[]=new int[n];
		String gg;
		for(int i=0;i<n;i++)
		{
			System.out.print("a["+i+"]=");
			gg="a["+i+"]=";
			obj.write(gg.toCharArray());
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		gg="Max=";
		obj.write(gg.toCharArray());
		obj.write(max);
	}
}