import java.io.*;
import java.util.Scanner;
// class BL
// {
	// FileOutputStream ob;
	// public BL(FileOutputStream ob)
	// {
		// this.ob = ob;
	// }
	// public void operation() throws IOException, FileNotFoundException 
	// {
		
   

// }
class Test 
{
   	public static void main(String args[]) throws IOException, FileNotFoundException 
	{
        File f = new File("Reverse Array.text");
        FileOutputStream ob  = new FileOutputStream(f);
		Scanner sc = new Scanner(System.in);
	   	int a[] = new int[10];
	   	int sum =0, i,temp;
	   	System.out.println("how many elements you want to enter");
	   	int n = sc.nextInt();
	   	 System.out.println("Enter elements of array");
	   
	   
	   	for(i = 0; i<n; i++)
	   	{
	     		a[i] = sc.nextInt();
	   	}
	    	String s  = "Actual elements of array are :";
		byte arr[] = s.getBytes();
		ob.write(arr);		
	   	String u = "\n";
				byte arv[] = u.getBytes();
				ob.write(arv);
	   	for( i = 0; i<n; i++)
	   	{
			ob.write(97);
			ob.write(91);
			ob.write(48+i);
			ob.write(93);
			ob.write(61);
			String sr = a[i]+"\n";
			byte arr1[] = sr.getBytes();
			ob.write(arr1); 
	   
	   	}
	     	String sa = "After reversing elements are:";
	   	byte arr2[] = sa.getBytes();
		ob.write(arr2);
		String k = "\n";
				byte ars[] = k.getBytes();
				ob.write(ars);
	   	for(i = 0; i<n/2; i++)
	   	{
	     
	      		temp = a[i];
	      		a[i] = a[n-(i+1)];
	      		a[n-(i+1)] = temp;
	      
	      
	   	}
	   	for(i = 0; i<n; i++)
		{
			ob.write(97);
			ob.write(91);
			ob.write(48+i);
			ob.write(93);
			ob.write(61);
			String sb = a[i]+"\n";
			byte arr3[] = sb.getBytes();
			ob.write(arr3); 	
		}
	   	
	}
		
		
		
		
		
		
		//BL b =new BL(ob);
		//b.operation();
   }
