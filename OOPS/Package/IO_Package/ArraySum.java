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
	// //

// 
class Test 
{
   	public static void main(String args[]) throws IOException, FileNotFoundException 
	{
        	File f = new File("Array_Sum.text");
        	FileOutputStream ob  = new FileOutputStream(f);
			Scanner sc = new Scanner(System.in);
	  	int a[] = new int[100];
	  	int sum =0; 
	  	System.out.println("how many elments you want to enter");
      	  	int n = sc.nextInt();
      	  	System.out.println("Enter your elements");
      	  
      	  for(int i =0; i<n; i++)
      	  {
      	    a[i] = sc.nextInt();
      	  }
	 	for(int i = 0; i<n; i++)
      	  	{
      	     	if(i%2==0)
      	     	{
      	      		sum = a[i]+5;
					ob.write(97);
					ob.write(91);
					ob.write(48+i);
					ob.write(93);
					ob.write(58);
				
					String s = Integer.toString(a[i]); 				
					byte arr[] = s.getBytes();
					ob.write(arr);
					ob.write(43);
					ob.write(53);
					ob.write(61);
					String m = Integer.toString(sum);
					byte ar[] = m.getBytes();
					ob.write(ar);
					String u = "\n";
					byte arv[] = u.getBytes();
					ob.write(arv);
      	      //System.out.println("\ta["+i+"]: "+a[i]+"+5="+sum);
      	     }  
      	  }
   
	}
			
			
			
			
			
		// BL b =new BL(ob);
		// b.operation();
}
