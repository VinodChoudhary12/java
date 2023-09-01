import java.io.*;
import java.util.Scanner;
class BL
{
	FileOutputStream ob;
	public BL(FileOutputStream ob)
	{
		this.ob = ob;
	}
	public void operation() throws IOException, FileNotFoundException 
	{
		int a[][] = new int[3][3];
	 	Scanner sc = new Scanner(System.in);
	 	int temp;
	 
		System.out.println("How many rows your want to enter");
	 	int n = sc.nextInt();
	 	System.out.println("How many column your want to enter");
	  	int m = sc.nextInt();
	   	System.out.println("Enter elements of array");
	   
	   
	   	System.out.println("Enter your array elements");
	 
	 	for(int i=0;i<n; i++)
	 	{
	   		for(int j=0;j<m; j++)
	   		a[i][j] = sc.nextInt();
	 	}
	   	for(int i=0; i<n; i++)
	  	{
	     		for(int j=0; j<m; j++)
	     		{
	        		String s = a[i][j]+"\t"; //Convering Array Into String.........
				byte arr[]= s.getBytes(); //Converting String in Byte Array
				ob.write(arr);
	     		}
	  		String sr = "\n";
			byte arr1[]= sr.getBytes();
			ob.write(arr1);
	  	}
	   	
	}
   

}
class Test 
{
   	public static void main(String args[]) throws IOException, FileNotFoundException 
	{
        	File f = new File("2DArray.text");
        	FileOutputStream ob  = new FileOutputStream(f);
		BL b =new BL(ob);
		b.operation();
        }
}